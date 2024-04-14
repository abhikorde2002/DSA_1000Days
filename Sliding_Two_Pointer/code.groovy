
import groovy.json.JsonOutput
import groovy.xml.XmlSlurper

import java.time.LocalDateTime
//mercurygate_jdi-3pl_prod.yml -jdi-logistics-3740
//import groovy.util.XmlParser
class JTSimmons {

    String transformXmlToJson(xmlString) {
        def xmlSlurper = new XmlSlurper()
        def xmlNode = xmlSlurper.parseText(xmlString)
        def payload = xmlNode

        // Define helper functions

        def date_time_format = { LocalDateTime d ->
            d.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"))
        }

        def MG_Delete = ["Delete", "Cancelled"]
        def MG_Delivered = ["Delivered"]
        println(MG_Delete)
        def MGshipmentBOL_status_check =  payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.find { it."@type" == "Load Number" || it."@isPrimary" == "true" } ?: ""

        def MGOStatus = payload.data.MercuryGate.MasterBillOfLading.Status
        def MGOperation = MG_Delete.indexOf(MGOStatus) != -1 || MGshipmentBOL_status_check.toLowerCase().contains("cancelled") ? "delete" : "add"

        def driverPhone = (payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber ?: []).find {
            it.type == "Driver Phone Number"
        }?.text

        def BOL =  payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.find { it.@isPrimary == "true" } ?: ""
        println(BOL)
        def deleteRefNumber = payload.data.MercuryGate.MasterBillOfLading.Status

        def customerTag = (payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event ?: []).findAll {
            it.type == "Drop"
        }.collect {
            it.Address.Name
        }

        def truckNumber = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.find {
            it.type == "Tractor Number"
        }?.text

        def trailerNumber = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.find {
            it.type == "Trailer Number"
        }?.text

        def MGOwnerTag = payload.data.MercuryGate.MasterBillOfLading.Owner.text()

        def MGOwner = !MGOwnerTag.isEmpty() ? MGOwnerTag.replace(' ', '-') : ""

        def valid_3PL_IDs = ["jdi-logistics---shipper", "sunb", "armstrong-flooring---usd", "armstrong-(ceiling)---usd"]

        def cnclLoad = payload.data.MercuryGate.MasterBillOfLading.Activities.Activity.find {
            it.type == "Cancelled Load"
        }?.Status[0]

        def cnclLoadFK = payload.data.MercuryGate.MasterBillOfLading.Activities.Activity.find {
            it.type == "FourKites Load Tracking"
        }?.Status[0]

        def shipperID = ["Armstrong-(Ceiling)---Usd": "armstrong-(ceiling)---usd",
                         "Armstrong Flooring - JDI Logistics": "armstrong-flooring---usd",
                         "JDI Logistics - Shipper": "jdi-logistics---shipper",
                         "Sunbury Transport": "sunb"][MGOwnerTag]
        def outputs = [:]
        def shipperIDfor3pl = shipperID ?: "jdi-logistics"
        println(shipperIDfor3pl)
        def jsonOutput =
                [

                                BillOfLading: BOL.contains("Cancelled") ? BOL.substringBefore("-Cancelled") : BOL,
                                DeliveryDetails: [
                                        delivered_at: new Date().format("yyyy-MM-dd'T'HH:mm:ss"),
                                        is_delivered: payload.data.MercuryGate.MasterBillOfLading.Status == "Delivered"
                                ],
                                Operation: deleteRefNumber == "Cancelled" || !cnclLoad.isEmpty() || cnclLoadFK == "Pending Cancel" ? "delete" : MGOperation,
                                ShipperIDfor3pl: shipperIDfor3pl,
                                ProNumber: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.find {
                                    it.type == "PRO"
                                }?.text,
                                Scac: payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC,
                                DriverPhone: !driverPhone.isEmpty() ? "+${driverPhone.replace('-','').replaceAll('\\+', '')}" : null,
                                TruckNumber: truckNumber,
                                TrailerNumber: trailerNumber,
                                LoadReferenceNumbers: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
                                    it.type in ["Sales Order Number", "BOL", "Shipper Order Number", "Sales Order Number", "ICC Manifest Number", "LoadID", "Delivery Number"]
                                },
                                Tags: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
                                    it.type in ["Customer Acct Number", "Dispatch User", "Agency Code", "Created By", "Mode", "LOCATION TYPE", "Equipment Type", "Agent", "Fourkites 3PL"]
                                } + customerTag + [MGOwnerTag],
                                Stops: [
                                        PickupStops: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll { it.@type == "Pickup" }.collect {
                                            [
                                                    stop_id: it.@internalId ?: null,
                                                    sequence: it.@sequenceNum ?: null,
                                                    address_line_1: it.Address.AddrLine1 ?: null,
                                                    address_line_2: it.Address.AddrLine2 ?: null,
                                                    city: it.Address.City ?: null,
                                                    country: it.Address.CountryCode ?: null,
                                                    postal: it.Address.PostalCode ?: null,
                                                    state: it.Address.StateProvince ?: null,
                                                    externalAddressId: it.Address.LocationCode ?: null,
                                                    ship_to: it.Address.LocationCode ?: null,
                                                    location: it.Address.Name ?: null,
                                                    reference_numbers: it.ReferenceNumbers.ReferenceNumber.findAll { ref -> ref.@type in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number", "Brokerage Probill Number", "Shipper Order Number", "Sales Order Number"] } ?: [],
                                                    earliest_arrival_time: it.Dates.Date.find { it.@type == "earliest" } ?: null,
                                                    latest_arrival_time: it.Dates.Date.find { it.@type == "latest" } ?: null,
                                                    customer: [
                                                            id: it.Address.LocationCode,
                                                            po_numbers:it.ReferenceNumbers.ReferenceNumber.findAll { po-> po.@type in ["PO Number", "Customer PO", "Customer PO Number", "PO"]}?: [],
                                                            poc: [
                                                                    alert: "false",
                                                                    name: it.Address.Contacts.Contact.Name ?: null,
                                                                    phone: it.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it.@type == "Phone" } ?: "",
                                                                    email: it.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it.@type == "Email" } ?: ""
                                                            ]
                                                    ],
                                                    pallets: [
                                                            parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.collect { pkg ->


                                                                [
                                                                        shipperPartNumber: pkg.ItemGroups.ItemGroup.LineItem.ItemId,
                                                                        customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum ?: null,
                                                                        weight: (pkg.ItemGroups.ItemGroup.Weights.Weight ?: "") + " " + (pkg.ItemGroups.ItemGroup.Weights.Weight.@uom ?: ""),
                                                                        quantity: (pkg.ItemGroups.ItemGroup.Quantities.Quantity ?: "") + " " + (pkg.ItemGroups.ItemGroup.Quantities.Quantity.@uom ?: "")
                                                                ]
                                                            }
                                                    ]
                                            ]
                                        },

                                        Delivery: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll { it.@type == "Drop" }.collect {
                                            [
                                                    stop_id: it.@internalId ?: null,
                                                    sequence: it.@sequenceNum ?: null,
                                                    address_line_1: it.Address.AddrLine1 ?: null,
                                                    address_line_2: it.Address.AddrLine2 ?: null,
                                                    city: it.Address.City ?: null,
                                                    country: it.Address.CountryCode ?: null,
                                                    postal: it.Address.PostalCode ?: null,
                                                    state: it.Address.StateProvince ?: null,
                                                    externalAddressId: it.Address.LocationCode ?: null,
                                                    ship_to: it.Address.LocationCode ?: null,
                                                    location: it.Address.Name ?: null,
                                                    reference_numbers: it.ReferenceNumbers.ReferenceNumber.findAll { ref -> ref.@type in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number", "Brokerage Probill Number", "Shipper Order Number", "Sales Order Number"] } ?: [],
                                                    earliest_arrival_time: it.Dates.Date.find { it.@type == "earliest" } ?: null,
                                                    latest_arrival_time: it.Dates.Date.find { it.@type == "latest" } ?: null,
                                                    customer: [
                                                            id: payload.data.MercuryGate.MasterBillOfLading.Owner ?: "",
                                                            po_numbers: it.ReferenceNumbers.ReferenceNumber.findAll {
                                                                it.type in ["PO Number", "Customer PO", "Customer PO Number", "PO"]
                                                            },
                                                            poc: [
                                                                    alert: "false",
                                                                    name: it.Address.Contacts.Contact.Name ?: null,
                                                                    phone: it.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it.@type == "Phone" } ?: "",
                                                                    email: it.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it.@type == "Email" } ?: ""
                                                            ]
                                                    ],
                                                    pallets: [
                                                            parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.collect { pkg ->
                                                                [
                                                                        shipperPartNumber: pkg.ItemGroups.ItemGroup.LineItem.ItemId,
                                                                        customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum,
                                                                        weight: (pkg.ItemGroups.ItemGroup.Weights.Weight ?: "") + " " + (pkg.ItemGroups.ItemGroup.Weights.Weight.@uom ?: ""),
                                                                        quantity: (pkg.ItemGroups.ItemGroup.Quantities.Quantity ?: "") + " " + (pkg.ItemGroups.ItemGroup.Quantities.Quantity.@uom ?: "")
                                                                ]
                                                            }
                                                    ]
                                            ]

                                        }
                                ]]



//        outputs.Loads = jsonOutput
//        def outputJson = new groovy.json.JsonBuilder(outputs)
//        print outputJson.toPrettyString()
        return jsonOutput

    }

}
//You can replace the `inputXml` variable with your actual XML data and execute the script to get the JSON output.