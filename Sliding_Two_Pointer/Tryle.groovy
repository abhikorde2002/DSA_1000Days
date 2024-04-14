
import groovy.json.JsonOutput
import groovy.xml.XmlSlurper

import java.time.LocalDateTime
 //	jd-irving
//import groovy.util.XmlParser
class JTSimmons {

// call this metthod and pass the input 
    String transformXmlToJson(xmlString) {
        def xmlSlurper = new XmlSlurper()
        def xmlNode = xmlSlurper.parseText(xmlString)
        def payload = xmlNode

        // Define helper functions

        def date_time_format = { LocalDateTime d ->
            d.format("yyyy-MM-dd'T'HH:mm:ss.SSS")
        }

        def MG_Delete = ["Delete", "Cancelled"]
        def MG_Delivered = ["Delivered"]

        def MGshipmentBOL_status_check = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@type == "Load Number" || it.@isPrimary == "true"
        }.join()

        def MGOStatus = payload.data.MercuryGate.MasterBillOfLading.Status

        def MGOperation = {
            if (MG_Delete.findIndexOf { it == MGOStatus } != -1) {
                "delete"
            } else if (MGshipmentBOL_status_check.toLowerCase().contains("cancelled")) {
                "delete"
            } else {
                "add"
            }
        }()

        def driverPhone = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@type == "Driver Phone Number"
        }.join()

        def BOL = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@isPrimary == "true"
        }.join()

        def deleteRefNumber = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@type == "Non-FourKites Carrier"
        }.join()

        def customerTag = payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll {
            it.@type == "Drop"
        }.collect { it.Address.Name }.join()

        def truckNumber = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@type == "Tractor Number"
        }[0]

        def trailerNumber = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
            it.@type == "Trailer Number"
        }[0]

        def MGOwnerTag = payload.data.MercuryGate.MasterBillOfLading.Owner
        println(MGOwnerTag)
     //   def MGOwner = payload.data.MercuryGate.MasterBillOfLading.Owner.replace(' ', '-')

        def valid_3PL_IDs = [
                "irving-consumer-products-parent",
                // Add other IDs here
        ]

        def Loads = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.collect { refNumber ->
            [
                    BillOfLading: BOL.contains("Cancelled") ? BOL.split("-Cancelled").first() : BOL,
                    Operation: !deleteRefNumber.isEmpty() ? "delete" : MGOperation,
                  //  ShipperIDfor3pl: valid_3PL_IDs.findIndexOf { it.toLowerCase() == MGOwner.toLowerCase() } != -1 ? MGOwner : 'midland-group',
                    ProNumber: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
                it.@type == "PRO"
            }.join(),
                    Scac: payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC,
                    DriverPhone: !driverPhone.isEmpty() ? "+${driverPhone.replaceAll(/[-+]*/, '')}" : null,
                    TruckNumber: !truckNumber.isEmpty() ? truckNumber : null,
                    TrailerNumber: !trailerNumber.isEmpty() ? trailerNumber : null,
                    LoadReferenceNumbers: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
                it.@type in ["Sales Order Number", "BOL", "Shipper Order Number", "ICC Manifest Number", "Delivery Number"]
            }.collect(),
                    Tags: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
                it.@type in ["Customer Acct Number", "Dispatch User", "Agency Code", "Created By", "Mode", "LOCATION TYPE", "Equipment Type", "Agent", "Fourkites 3PL"]
            }.collect() + customerTag + [MGOwnerTag],
                    Stops: [
                            PickupStops: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll {
                        it.@type == "Pickup"
                    }.collect { event ->
                        [
                                stop_id: event.@internalId ?: null,
                                sequence: event.@sequenceNum ?: null,
                                address_line_1: event.Address.AddrLine1 ?: null,
                                address_line_2: event.Address.AddrLine2 ?: null,
                                city: event.Address.City ?: null,
                                country: event.Address.CountryCode ?: null,
                                postal: event.Address.PostalCode ?: null,
                                state: event.Address.StateProvince ?: null,
                                externalAddressId: event.Address.LocationCode ?: null,
                                ship_to: event.Address.LocationCode ?: null,
                                location: event.Address.Name ?: null,
                                reference_numbers: event.ReferenceNumbers.ReferenceNumber.findAll {
                            it.@type in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number", "Brokerage Probill Number", "Shipper Order Number", "Sales Order Number"]
                        }.collect(),
                                earliest_arrival_time: !event.Dates.Date.findAll { it.@type in ["appointmentEarly", "earliest"] }.isEmpty() ? event.Dates.Date.findAll { it.@type in ["appointmentEarly", "earliest"] }.first().toString() : null,
                                latest_arrival_time: !event.Dates.Date.findAll { it.@type in ["appointmentLate", "latest"] }.isEmpty() ? event.Dates.Date.findAll { it.@type in ["appointmentLate", "latest"] }.first().toString() : null,
                                customer: [
                                        id: event.Address.LocationCode,
                                        po_numbers: event.ReferenceNumbers.ReferenceNumber.findAll {
                                    it.@type in ["PO Number", "Customer PO", "Customer PO Number", "PO"]
                                }.collect(),
                                        poc: [
                                                alert: "false",
                                                name: event.Address.Contacts.Contact.Name ?: null,
                                                phone: event.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll {
                                            it.@type == "Phone"
                                        }.join(),
                                                email: event.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll {
                                            it.@type == "Email"
                                        }.join()
                                        ]
                                ]
                        ]
                    },
                            DeliveryStops: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll {
                        it.@type == "Drop"
                    }.collect { event ->
                        [
                                stop_id: event.@internalId ?: null,
                                sequence: event.@sequenceNum ?: null,
                                address_line_1: event.Address.AddrLine1 ?: null,
                                address_line_2: event.Address.AddrLine2 ?: null,
                                city: event.Address.City ?: null,
                                country: event.Address.CountryCode ?: null,
                                postal: event.Address.PostalCode ?: null,
                                state: event.Address.StateProvince ?: null,
                                externalAddressId: event.Address.LocationCode ?: null,
                                ship_to: event.Address.LocationCode ?: null,
                                location: event.Address.Name ?: null,
                                reference_numbers: event.ReferenceNumbers.ReferenceNumber.findAll {
                            it.@type in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number", "Brokerage Probill Number", "Shipper Order Number", "Sales Order Number"]
                        }.collect(),
                                earliest_arrival_time: !event.Dates.Date.findAll { it.@type in ["appointmentEarly", "earliest"] }.isEmpty() ? event.Dates.Date.findAll { it.@type in ["appointmentEarly", "earliest"] }.first().toString() : null,
                                latest_arrival_time: !event.Dates.Date.findAll { it.@type in ["appointmentLate", "latest"] }.isEmpty() ? event.Dates.Date.findAll { it.@type in ["appointmentLate", "latest"] }.first().toString() : null,
                                customer: [
                                        id: event.Address.LocationCode,
                                        po_numbers: event.ReferenceNumbers.ReferenceNumber.findAll {
                                    it.@type in ["PO Number", "Customer PO", "Customer PO Number", "PO"]
                                }.collect(),
                                        poc: [
                                                alert: "false",
                                                name: event.Address.Contacts.Contact.Name ?: null,
                                                phone: event.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll {
                                            it.@type == "Phone"
                                        }.join(),
                                                email: event.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll {
                                            it.@type == "Email"
                                        }.join()
                                        ]
                                ]
                        ]
                    }
                    ]
            ]
        }

//        def jsonOutput = JsonOutput.toJson([Loads: Loads])
        return  Loads


    }

}
//You can replace the `inputXml` variable with your actual XML data and execute the script to get the JSON output.