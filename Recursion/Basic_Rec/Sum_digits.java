package Recursion.Basic_Rec;

public class Sum_digits {
    public static void main(String[] args) {
        System.out.println(Sum(1342));
    }

    static int Sum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + Sum(n/10);
    }
}

// import java.time.LocalDateTime
// import groovy.json.JsonOutput


// class JTSproutsFarmersMarket
// {

// // Define helper function for date/time formatting
//     def getMovementDateTime(String dateTime, String timeZone) {
//         ZonedDateTime.parse(dateTime).withZoneSameInstant(ZoneId.of(timeZone)).toString()
//     }

// // Main processing function
//     String processFKMap(String xml) {
//       // CSV input




// //import groovy.util.XmlParser

// def XmlString=xml


// def xmlSlurper = new XmlSlurper()
// def xmlNode = xmlSlurper.parseText(XmlString)
// def payload = xmlNode


// // Load operation
// def MG_Delete = ["Delete", "Cancelled"]
// def MG_Delivered = ["Delivered"]

// def MGOwnerTag = payload.data.MercuryGate.MasterBillOfLading.Owner.text()
// // BOL number
// def MGshipmentBOL_status_check = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll { it.@type == "Load Number" || it.@isPrimary == "true" }.text() ?: ""

// // Load status
// def MGOStatus = payload.data.MercuryGate.MasterBillOfLading.Status
// def MGOperation = "add"
// if (MG_Delete.findIndexOf { it == MGOStatus } != -1 || MGshipmentBOL_status_check.contains("Cancelled")) {
//     MGOperation = "delete"
// }

// def tags= (payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll { it->
//                                     ["Customer Acct Number", "Dispatch User", "Agency Code", "Created By", "Mode", "LOCATION TYPE",  "Agent", "Shipment Type"].contains(it.@type.text())
//                                 }.collect { it ->
//                                     it.text()
//                                 } ?: [])
// def highValue = payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" == "High Value Item"
// }.collect { it.toLowerCase() }.join("")
//  def priority = highValue == "true" ? "high" : "normal"
//   def tagList = priority == "high" ? ["High Value Item"] + tags : tags
  
// def driverPhone = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll { it.@type == "Driver Phone Number" } ?: ""

// //def BOL = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll { it.@isPrimary == "true" } ?: ""
// def primaryReferenceNumber = payload?.data?.MercuryGate?.MasterBillOfLading?.ReferenceNumbers?.ReferenceNumber?.find {
//     it.@isPrimary == "true"
// }
//  def customerTag =[]
//  (payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event ?: []).each { event ->
//     if (event.@type.text() == "Drop") {
//         customerTag.add(event.Address.Name.text())
//     }
// }
// def productID = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" == "Temperature Min"
// }.collect { it }.join("")
// def BOL = primaryReferenceNumber ? primaryReferenceNumber.text() : ""
// def scacField = "SCAC: " + payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC.text()

// // def stopIdString = payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll { it.@type == "Pickup" }.collect { it.@internalId.text() }

// // def stopIdIntList = stopIdString.collect { it as long }
// def jsonOutput = [
//         Loads:
//                 [
//                         [
//                                 BillOfLading        : BOL.contains("Cancelled") ? BOL.substringBefore("-") : BOL,
//                                 Operation           : MGOperation,
//                                  ProductTypeTemp: [
//                                 externalId: productID
//                         ],
//                                 ProNumber           : payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll { it.@type == "PRO" }.text() ?: "",
//                                 Scac                : payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC.text()?:null,
                              
//                                 LoadReferenceNumbers: (payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {it->
//                                     ["Sales Order Number", "BOL", "Pickup Number"].contains(it.@type.text())
//                                 }.collect { it ->
//                                     it.text()
//                                 } ?: []),
//                                 Tags                : tagList,
//                                 Stops               : [
//                                         PickupStops  : payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll { it.@type == "Pickup" }.collect {
//                                             [
//                                                     stop_id              : it.@internalId.text()?: null,
//                                                     sequence             : it.@sequenceNum.text() ?: null,
//                                                     address_line_1       : it.Address.AddrLine1.text() ?: null,
//                                                     address_line_2       : it.Address.AddrLine2.text() ?: null,
//                                                     city                 : it.Address.City.text() ?: null,
//                                                     country              : it.Address.CountryCode.text() ?: null,
//                                                     postal               : it.Address.PostalCode.text() ?: null,
//                                                     state                : it.Address.StateProvince.text() ?: null,
//                                                  //   externalAddressId    : it.Address.LocationCode.text() ?: null,
//                                                     ship_to              : it.Address.LocationCode.text() ?: null,
//                                                     location             : it.Address.Name.text() ?: null,
//                                                     reference_numbers    : it.ReferenceNumbers.ReferenceNumber.findAll { ref ->
//                                                         ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number"].contains(ref.@type.text())
//                                                     }.collect { ref ->
//                                                         ref.text()
//                                                     } ?: [],
//                                                     earliest_arrival_time: it.Dates.Date.findAll { it.@type == "appointmentEarly" }.text() ?: null,
//                                                     latest_arrival_time  : it.Dates.Date.findAll { it.@type == "appointmentLate" }.text() ?: null,
//                                                     want_time:it.Dates.Date.find { it.@type == "appointmentEarly" }.text() ?: null,
//                                                     customer             : [
//                                                             id        : it.data.MercuryGate.MasterBillOfLading.Owner.text() ?: "",
//                                                              po_numbers:[],
//                                                             poc       : [
//                                                                     alert: "false",
//                                                                     name : it.Address.Contacts.Contact.Name.text() ?: null,
//                                                                     phone: it.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll { it.@type == "Phone" }.text() ?: "",
//                                                                     email: it.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll { it.@type == "Email" }.text() ?: ""
//                                                             ]
//                                                     ],
//                                                     pallets              :[ [
//                                                             parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.collect { pkg ->
//                                                                 [
//                                                                         shipperPartNumber : pkg.ItemGroups.ItemGroup.LineItem.ItemId.text()?:null,
//                                                                         customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum.text()?:null,
//                                                                         weight            : (pkg.ItemGroups.ItemGroup.Weights.Weight.findAll{it.@type=="actual"}.text() ?: "") + " " + (pkg.ItemGroups.ItemGroup.Weights.Weight.findAll{it.@type=="actual"}.@uom.text() ?: ""),
//                                                                         quantity          : (pkg.ItemGroups.ItemGroup.Quantities.Quantity.findAll{it.@type=="actual"}.text() ?: "") + " " + (pkg.ItemGroups.ItemGroup.Quantities.Quantity.findAll{it.@type=="actual"}.@uom.text() ?: "")
//                                                                 ]
//                                                             }
//                                                     ]
//                                             ]]
//                                         },
//                                         DeliveryStops  : payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll { it.@type == "Drop" }.collect { stop ->
//                                             [
//                                                     stop_id              : stop.@internalId.text() ?: null,
//                                                     sequence             : stop.@sequenceNum.text()?: null,
//                                                     address_line_1       : stop.Address.AddrLine1.text() ?: null,
//                                                     address_line_2       : stop.Address.AddrLine2.text() ?: null,
//                                                     city                 : stop.Address.City.text() ?: null,
//                                                     country              : stop.Address.CountryCode.text() ?: null,
//                                                     postal               : stop.Address.PostalCode.text() ?: null,
//                                                     state                : stop.Address.StateProvince.text() ?: null,
//                                                  //   externalAddressId    : it.Address.LocationCode.text() ?: null,
//                                                     ship_to              : stop.Address.LocationCode.text() ?: null,
//                                                     location             : stop.Address.Name.text() ?: null,
//                                                     reference_numbers    : stop.ReferenceNumbers.ReferenceNumber.findAll { ref ->
//                                                         ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number"].contains(ref.@type.text())
//                                                     }.collect { ref ->
//                                                         ref.text()
//                                                     } ?: [],
//                                                     earliest_arrival_time: stop.Dates.Date.findAll { it.@type == "appointmentEarly" }.text() ?: null,
//                                                     latest_arrival_time  : stop.Dates.Date.findAll { it.@type == "appointmentLate" }.text() ?: null,
//                                                       want_time:stop.Dates.Date.find { it.@type == "appointmentEarly" }.text() ?: null,
//                                                     customer             : [
//                                                             id        : stop.data.MercuryGate.MasterBillOfLading.Owner.text() ?: "",
                                            
//                                                             po_numbers:stop.ReferenceNumbers.ReferenceNumber.findAll { ref ->
//                                                                         ["PO Number", "Customer PO", "Customer PO Number", "PO"].contains(ref.@type.text())
//                                                                     }.collect { ref ->
//                                                                         ref.text()
//                                                                     } ?: [],,
//                                                             poc       : [
//                                                                     alert: "false",
//                                                                     name : stop.Address.Contacts.Contact.Name.text() ?: null,
//                                                                     phone: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll { it.@type == "Phone" }.text() ?: "",
//                                                                     email: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.findAll { it.@type == "Email" }.text() ?: null
//                                                             ]
//                                                     ],
//                                                     pallets              :[ [
//                                                       parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.find { pkg ->
//                                 stop.Packages.Package.find { it."@internalId" == pkg."@internalId" }
//                             }.collect { pkg ->
//                                 [
//                                                  shipperPartNumber : pkg.ItemGroups.ItemGroup.LineItem.ItemId.text()?:null,
//                                                                         customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum.text()?:null,
//                                                                         weight            : (pkg.ItemGroups.ItemGroup.Weights.Weight.findAll{it.@type=="actual"}.text() ?: "") + " " + (pkg.ItemGroups.ItemGroup.Weights.Weight.findAll{it.@type=="actual"}.@uom.text() ?: ""),
//                                                                         quantity          : (pkg.ItemGroups.ItemGroup.Quantities.Quantity.findAll{it.@type=="actual"}.text() ?: "") + " " + (pkg.ItemGroups.ItemGroup.Quantities.Quantity.findAll{it.@type=="actual"}.@uom.text() ?: "")
//                                 ]
//                             }
//                                                     ]
//                                             ]]
//                                         },
//                                 ]
//                         ]
//                 ]
// //return  jsonOutput
// ]
// //def output = [Loads: jsonOutput]
// // println jsonOutput


//  return JsonOutput.prettyPrint(JsonOutput.toJson(jsonOutput))

//     }
// }

// JTSproutsFarmersMarket jtjdi=new JTSproutsFarmersMarket();  
// output=jtjdi.processFKMap(input)





// import groovy.json.JsonBuilder
// import groovy.json.JsonSlurper
// import groovy.json.JsonOutput
// //import groovy.xml.XmlSlurper
// import org.apache.commons.io.IOUtils;
// import java.io.IOException;
// import java.io.InputStream;
// import java.nio.charset.StandardCharsets;

// //class JTSproutsFarmersMarket{
// InputStream inputst = JTUtil.downloadFile(7022367)
// String input= IOUtils.toString(inputst, StandardCharsets.UTF_8)

// //def input = new File('/Users/ajay/IdeaProjects/MuleMaps/src/INPUT').getText()

// def jsonSlurper = new JsonSlurper()
// //def payload = jsonSlurper.parseText(JsonOutput.toJson(new XmlSlurper().parseText(input)))
// def payload = new XmlSlurper().parseText(input)
// // load operation
// def MG_Delete = ["Delete", "Cancelled"]
// def MG_Delivered = ["Delivered"]

// // BOL number
// def MGshipmentBOL_status_check = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" == "Load Number" || it."@isPrimary" == "true"
// }.collect { it }.join("") ?: ""

// // load status
// def MGOStatus = payload.data.MercuryGate.MasterBillOfLading.Status

// def MGOperation = ""
// if (MG_Delete.any { it == MGOStatus }) {
//     MGOperation = "delete"
// } else if (MGshipmentBOL_status_check.toLowerCase().contains("cancelled")) {
//     MGOperation = "delete"
// } else if (MG_Delete.any { it == MGOStatus }) {
//     MGOperation = "add"
// } else {
//     MGOperation = "add"
// }

// def BOL = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@isPrimary" == "true"
// }.collect { it }.join("")

// def highValue = payload.data.MercuryGate.MasterBillOf Lading.Plan.Events.Event.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" == "High Value Item"
// }.collect { it.toLowerCase() }.join("")

// def productID = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" == "Temperature Min"
// }.collect { it }.join("")

// def priority = highValue == "true" ? "high" : "normal"

// def tags = payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//     it."@type" in ["Customer Acct Number", "Dispatch User", "Agency Code", "Created by", "Mode", "LOCATION TYPE", "Agent", "Shipment Type"]
// }

// def tagList //= priority == "high" ? ["High Value Item"] + tags //: tags
// println(payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC)

// //class JTSproutsFarmersMarket{
    
// def result = [
//         Loads: [
//                 [
//                         BillOfLading: BOL?.contains("Cancelled") ? BOL.split("-")[0] : BOL,
//                         Operation: MGOperation,
//                         ProductTypeTemp: [
//                                 externalId: productID
//                         ],
//                         ProNumber: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//                             it."@type" == "PRO"
//                         }.collect { it }.join(""),
//                         Scac: payload.data.MercuryGate.MasterBillOfLading.Carriers.Carrier.SCAC as String,
//                         LoadReferenceNumbers: payload.data.MercuryGate.MasterBillOfLading.ReferenceNumbers.ReferenceNumber.findAll {
//                             it."@type" in ["Sales Order Number", "BOL", "Pickup Number"]
//                         },
//                         Tags: tagList,
//                         Stops: [
//                                 PickupStops: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll {
//                                     it."@type" == "Pickup"
//                                 }.collect { stop ->
//                                     [
//                                             stop_id: stop."@internalId" as String,
//                                             sequence: stop."@sequenceNum" as String,
//                                             address_line_1: stop.Address.AddrLine1 as String,
//                                             address_line_2: stop.Address.AddrLine2 as String,
//                                             city: stop.Address.City as String,
//                                             country: stop.Address.CountryCode as String,
//                                             postal: stop.Address.PostalCode as String,
//                                             state: stop.Address.StateProvince as String,
//                                             ship_to: stop.Address.LocationCode as String,
//                                             location: stop.Address.Name as String,
//                                             reference_numbers: stop.ReferenceNumbers.ReferenceNumber.findAll {
//                                                 it."@type" in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number"]
//                                             },
//                                             earliest_arrival_time: stop.Dates.Date.find { it."@type" == "appointmentEarly" } as String,
//                                             latest_arrival_time: stop.Dates.Date.find { it."@type" == "appointmentLate" } as String,
//                                             want_time: stop.Dates.Date.find { it."@type" == "appointmentLate" } as String,
//                                             customer: [
//                                                     id: payload.data.MercuryGate.MasterBillOfLading.Owner as String ?: "",
//                                                     po_numbers: [],
//                                                     poc: [
//                                                             alert: "false",
//                                                             name: stop.Address.Contacts.Contact.Name as String,
//                                                             phone: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it."@type" == "Phone" } as String,
//                                                             email: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it."@type" == "Email" }  as String
//                                                     ]
//                                             ],
//                                             pallets: [
//                                                     parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.collect { pkg ->
//                                                         [
//                                                                 shipperPartNumber: pkg.ItemGroups.ItemGroup.LineItem.ItemId as String,
//                                                                 customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum as String,
//                                                                 weight: pkg.ItemGroups.ItemGroup.Weights.Weight ? "${pkg.ItemGroups.ItemGroup.Weights.Weight.find{ it."@type" == "actual" }} ${pkg.ItemGroups.ItemGroup.Weights.Weight.find{ it."@type" == "actual" }.'@uom' ?: ''}" : "",
//                                                                 quantity: pkg.ItemGroups.ItemGroup.Quantities.Quantity ? "${pkg.ItemGroups.ItemGroup.Quantities.Quantity.find{ it."@type" == "actual" }} ${pkg.ItemGroups.ItemGroup.Quantities.Quantity.find{ it."@type" == "actual" }.'@uom' ?: ''}" : ""
//                                                         ]
//                                                     }
//                                             ]
//                                     ]
//                                 },
//                                 DeliveryStops: payload.data.MercuryGate.MasterBillOfLading.Plan.Events.Event.findAll {
//                                     it."@type" == "Drop"
//                                 }.collect { stop ->
//                                     [
//                                             stop_id: stop."@internalId" as String,
//                                             sequence: stop."@sequenceNum" as String,
//                                             address_line_1: stop.Address.AddrLine1 as String,
//                                             address_line_2: stop.Address.AddrLine2 as String,
//                                             city: stop.Address.City as String,
//                                             country: stop.Address.CountryCode as String,
//                                             postal: stop.Address.PostalCode as String,
//                                             state: stop.Address.StateProvince as String,
//                                             ship_to: stop.Address.LocationCode as String,
//                                             location: stop.Address.Name as String,
//                                             reference_numbers: stop.ReferenceNumbers.ReferenceNumber.findAll {
//                                                 it."@type" in ["Customer ID", "Sales Order", "Shipping Order", "Pickup #", "Delivery Appointment", "Customer Load Number"]
//                                             },
//                                             earliest_arrival_time: stop.Dates.Date.find { it."@type" == "appointmentEarly" } as String,
//                                             latest_arrival_time: stop.Dates.Date.find { it."@type" == "appointmentLate" } as String,
//                                             want_time: stop.Dates.Date.find { it."@type" == "appointmentLate" } as String,
//                                             customer: [
//                                                     id: payload.data.MercuryGate.MasterBillOfLading.Owner  as String ?: "",
//                                                     po_numbers: stop.ReferenceNumbers.ReferenceNumber.findAll {
//                                                         it."@type" in ["PO Number", "Customer PO", "Customer PO Number", "PO"]
//                                                     },
//                                                     poc: [
//                                                             alert: "false",
//                                                             name: stop.Address.Contacts.Contact.Name as String,
//                                                             phone: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it."@type" == "Phone" } as String,
//                                                             email: stop.Address.Contacts.Contact.ContactMethods.ContactMethod.find { it."@type" == "Email" } as String
//                                                     ]
//                                             ],
//                                             pallets: [
//                                                     parts: payload.data.MercuryGate.MasterBillOfLading.RelatedItems.Packages.Package.findAll {
//                                                         stop.Packages.Package."@internalId" == it."@internalId"
//                                                     }.collect { pkg ->
//                                                         [
//                                                                 shipperPartNumber: pkg.ItemGroups.ItemGroup.LineItem.ItemId as String,
//                                                                 customerPartNumber: pkg.ItemGroups.ItemGroup.LineItem.CustomerPartNum as String,
//                                                                 weight: pkg.ItemGroups.ItemGroup.Weights.Weight ? "${pkg.ItemGroups.ItemGroup.Weights.Weight.find{ it."@type" == "actual" }} ${pkg.ItemGroups.ItemGroup.Weights.Weight.find{ it."@type" == "actual" }.'@uom' ?: ''}" : "",
//                                                                 quantity: pkg.ItemGroups.ItemGroup.Quantities.Quantity ? "${pkg.ItemGroups.ItemGroup.Quantities.Quantity.find{ it."@type" == "actual" }} ${pkg.ItemGroups.ItemGroup.Quantities.Quantity.find{ it."@type" == "actual" }.'@uom' ?: ''}" : ""
//                                                         ]
//                                                     }
//                                             ]
//                                     ]
//                                 }
//                         ]
//                 ]
//         ]
        
// ]
// //return JsonOutput.toJson(result)

// //return JsonOutput.toJson(result)

// //JTSproutsFarmersMarket JTSproutsFarmersMarketobj = new JTSproutsFarmersMarket()
// //println(result)
// def xmloutput = JsonOutput.toJson(result)
// println xmloutput
// //def xmloutput = JTSproutsFarmersMarketobj.result

