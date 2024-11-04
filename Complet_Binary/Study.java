package Complet_Binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    TreeNode node;
    int ind;
    Pair(TreeNode node,int ind){
        this.ind=ind;
        this.node=node;
    }
}
public class Study {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
         System.out.println(top_view(tree));
    }

    static ArrayList<Integer> top_view(TreeNode node){
        ArrayList<Integer> list= new ArrayList<>();
        if(node==null)return list;

        Map<Integer,Integer> map=new TreeMap();
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(node, 0));

        while(!queue.isEmpty()) {
            Pair p=queue.remove();
            int ind=p.ind;
            TreeNode n=p.node;
   
            if(!map.containsKey(ind)){
                map.put(ind, n.val);
            }
             if(n.left!=null)queue.add(new Pair(n.left, ind-1));
             if(n.right!=null)queue.add(new Pair(n.right,ind+1));
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.net.HttpURLConnection
import java.net.URL
import java.util.Base64
import groovy.time.TimeCategory
import groovy.time.TimeDuration
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
username = "EssersZonenNVAPI@fourkites.com"
password = "Fourkites@202409"
basicCreds = "${username}:${password}".bytes.encodeBase64().toString()
def convertJSONStringToJSONObj(String input) {
   JsonSlurper parser = new JsonSlurper()
   def inputObj = parser.parseText(input)
   return inputObj
}
def companyIds = [
    "014794", "042452", "060070", "060860", "089789", "103697", "103700", 
    "103769", "103792", "123505", "138036", "173373", "215863", "215864", 
    "215866", "238283", "238683", "241076", "348826", "251049", "289389"
]

def callFkApi(def pageNo, def companyId) {
    def apiUrl = "https://tracking-api.fourkites.com/api/v1/tracking/search?company_id=${companyId}&locale=en"
    def apiBody = """
        {
            "shipper": "baxter-emea",
            "load_status": 
            "awaiting_tracking_info,tracking_info_assigned,tracking,at_pickup,partially_picked_up,picked_up,at_terminal,line_haul,out_for_delivery,at_consignee,partially_delivered",
            "page": "${pageNo}",
            "per_page": "50"
        }
    """

    try {
        def url = new URL(apiUrl)
        def connection = url.openConnection()

        connection.setRequestMethod("POST")
        connection.setRequestProperty("Authorization", "Basic ${basicCreds}")
        connection.setRequestProperty("Content-Type", "application/json")
        connection.setDoOutput(true)

        def writer = new OutputStreamWriter(connection.getOutputStream())
        writer.write(apiBody)
        writer.flush()

        def responseCode = connection.getResponseCode()
        if (responseCode == 200) {
            def inputStream = connection.getInputStream()
            def jsonResponse = new JsonSlurper().parseText(new BufferedReader(new InputStreamReader(inputStream)).getText())
            return jsonResponse
        } else {
            def errorStream = connection.getErrorStream()
            def errorResponse = new BufferedReader(new InputStreamReader(errorStream)).getText()
            return errorResponse
        }
    } catch (Exception e) {
        JTUtil.logSuccessEvent("Error in callFkApi for companyId: ${companyId}",transactionId ,"${e.message}")
        println("Error in callFkApi for companyId: ${companyId}, ${e.message}")
        return null
    }
}

def callFKApiToGetLoadNumber(def companyId) {
    def pageNo = 1
    def totalPageNo
    def activeLoads = []

    try {
        def trialLoads = callFkApi(pageNo, companyId)
        def parsedTrialLoads = trialLoads
        totalPageNo = parsedTrialLoads?.pagination?.totalPages ?: 0

        while (pageNo <= totalPageNo) {
            def loads = callFkApi(pageNo, companyId)
            def parsedLoads = loads
            parsedLoads?.loads?.each { load ->
                activeLoads.add([
                    loadNumber: load.loadNumber.toString(),
                    originAppointmentTime: load.originAppointmentTime
                ])
            }
            pageNo++
        }

        return activeLoads
    } catch (Exception e) {
        JTUtil.logSuccessEvent("Error in callFKApiToGetLoadNumber:",transactionId,"${e.message}")
        println("Error in callFKApiToGetLoadNumber: ${e.message}")
        return []
    }
}

def callTrackingAPI(def clientId) {
    def apiUrl = 'https://api.essers.com/gateway/TrackingAPI_FourKites'
    def apiKey = '60071d78-a54c-4591-be76-338edeca84e9'
    def username = 'FOURKITES'
    def password = 'DmC4L1pU3L'
    def authString = "${username}:${password}".bytes.encodeBase64().toString()

    def url = new URL(apiUrl)
    def connection = (HttpURLConnection) url.openConnection()

    connection.setRequestMethod('GET')
    connection.setRequestProperty('X-Gravitee-Api-Key', apiKey)
    connection.setRequestProperty('Content-Type', 'application/json')
    connection.setRequestProperty('Client-id', clientId)
    connection.setRequestProperty('Authorization', "Basic ${authString}")

    def responseCode = connection.responseCode
    if (responseCode == 200) {
        def responseText = connection.inputStream.withReader("UTF-8") { reader -> reader.text }
        def jsonSlurper = new JsonSlurper()
        def jsonResponse = jsonSlurper.parseText(responseText)
        return jsonResponse
    } else {
        JTUtil.logSuccessEvent("Failed with response code: ${responseCode} for clientId: ${clientId}",transactionId,"")
        println("Failed with response code: ${responseCode} for clientId: ${clientId}")
        return null
    }
}

    
    def outputJson
// Process for each companyId
companyIds.each { clientId ->
    println "Processing for Client ID: ${clientId}"
    
    def formattedResponse = callTrackingAPI(clientId)
    def loadNumbers = callFKApiToGetLoadNumber(clientId)
    // def loadNumbers = [
    // [loadNumber: ".", originAppointmentTime: "2024-10-21T00:00:00Z"],
    // [loadNumber: "3742789100", originAppointmentTime: "2024-10-21T00:00:00Z"],
    // [loadNumber: ".", originAppointmentTime: "2024-10-14T00:00:00Z"],
    // [loadNumber: "3742789100", originAppointmentTime: "2024-10-14T00:00:00Z"]
//]
    println JsonOutput.prettyPrint(JsonOutput.toJson(formattedResponse))
    println "Load numbers from FK API: ${loadNumbers}"

    if (formattedResponse && loadNumbers) {
         outputJson = [
            senderFlag: "JusTransform",
            updates: []
        ]

formattedResponse.each { stop ->
    def essersReference = stop?.essersReference?.toString()
    def matchingLoad = loadNumbers.findAll { it.loadNumber == essersReference }

    if (matchingLoad) {
        println "Match found for essersReference: ${essersReference}"
        JTUtil.logSuccessEvent("Match found for essersReference: ${essersReference}", transactionId, "")

        def eventOn = stop?.status?.eventOn ?: null
        def statusCode = stop?.status?.statusCode ?: null
        def positionOn = stop?.locationData?.positionOn ?: null
        def statusDescription = stop?.status?.reason ?: null
        def longitudeLocation = stop?.locationData?.longitude ?: null
        def latitudeLocation = stop?.locationData?.latitude ?: null
        def estimatedArrivalAt = stop?.eta?.estimatedArrivalAt ?: null

        // Map statusCode to desired values
        if (statusCode == "151") {
            statusCode = "AF"
            statusDescription = "Picked Up"
        } else if (statusCode == "012") {
            statusCode = "D1"
            statusDescription = "Delivered"
        } else if (statusCode == "133") {
            statusCode = "IO"
            statusDescription = "Time of arrival at the crossdock"
        } else if (statusCode == "132") {
            statusCode = "IO"
            statusDescription = "Time of departure from the crossdock"
        } else if (statusCode == "999") {
            statusCode = "CA"
            statusDescription = "Load Cancelled"
        } else {
            statusCode = ""
            statusDescription = ""
        }

        // Create a base update entry without loadUpdate array
        def baseUpdateEntry = [
            timeZone: "UTC",
            billToCode: "Esser-Baxter",
            identifierKeys: [
                [
                    identifier: essersReference,
                    identifierType: "loadNumber"
                ]
            ]
        ]
      
    def val=JTLookupUtil.getLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference)
       println val
        def flage=false

          if(val==null){
              def value="""{
                 "statusCode":"${statusCode}",
                 "Time":"${eventOn}"
            }"""


def inputObj = convertJSONStringToJSONObj(value)
JTLookupUtil.putLookupTableValue('7753326640424446848c8c7beec4eae6',essersReference, inputObj)


println JTLookupUtil.getLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference,"statusCode")
}
else if(val!=null) {
    println "dfg"
 def status=   JTLookupUtil.getLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference,"statusCode")
 def tim=JTLookupUtil.getLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference,"Time")
 if(status!=statusCode && tim!=eventOn){
     flage=true
 }

    
}
        // Add locationUpdate if available
        if (positionOn) {
            def locationUpdateEntry = baseUpdateEntry.clone() // Clone to avoid overriding the base entry
            locationUpdateEntry.loadUpdate = [[
                locationUpdate: [
                    latitude: latitudeLocation,
                    longitude: longitudeLocation,
                    locatedAt: positionOn
                ]
            ]]
            outputJson.updates << locationUpdateEntry
        }

        // Add eventUpdate if available
        if (eventOn && flage!=false) {
            def eventUpdateEntry = baseUpdateEntry.clone() // Clone to avoid overriding the base entry
            eventUpdateEntry.loadUpdate = [[
                eventUpdate: [
                    statusCode: statusCode,
                    statusDescription: statusDescription,
                    eventTimeStamp: eventOn
                ]
            ]]
            outputJson.updates << eventUpdateEntry
        }

        // Add estimatedArrivalAt if available
        if (estimatedArrivalAt) {
            def etaUpdateEntry = baseUpdateEntry.clone() // Clone to avoid overriding the base entry
            etaUpdateEntry.loadUpdate = [[
                eta: [
                    estimatedArrivalAt: estimatedArrivalAt
                ]
            ]]
            outputJson.updates << etaUpdateEntry
        }

        JTUtil.logSuccessEvent("JsonOutput for the essersReference : ${essersReference}", transactionId, JsonOutput.prettyPrint(JsonOutput.toJson(outputJson)))
        println JsonOutput.prettyPrint(JsonOutput.toJson(outputJson))
    } else {
        JTUtil.logSuccessEvent("No matching loadNumber for essersReference: ${essersReference}", transactionId, "")
        println "No matching loadNumber for essersReference: ${essersReference}"
    }
}

    }
}

def outPayload=JsonOutput.prettyPrint(JsonOutput.toJson(outputJson))


//Get all data from the Lookup table as string.
//Table Name: Essers_Zonen N_V_Location_Status_Update, Creator Email: admin@fkcarriersent.com, Description: loadNumber and Statuscode





lookupToken="ZjZiZGI0YjNlN2EzMjQ4YWY3ZjVlMjU2MDFjYTY0OGJmOTc0YTBjNGY1OGUxY2IzYjg2ZDA0Njg2MjhkYjJkNGNjOTI1ZTVkYTQzZTRkM2YyMjEzZDI5OTU3MmI2ZTQy"

// import groovy.json.JsonOutput
 
def essersReference = "3742789100"
 lookupHashmap=[:]
 def data="IO@11/27/2023 8:00:00 AM"
//  IO@11/27/2023 8:00:00 AM
// JTUtil.putLookupTableValueByToken(lookupToken, essersReference, data)
 println"Hello"
 
 def lookupValue=JTUtil.getLookupTableByToken(lookupToken)
def jsonSlurper = new JsonSlurper()
def jsonObject = jsonSlurper.parseText(lookupValue)
println jsonObject
jsonObject.each{ key,value ->
    lookupHashmap.put(key,value)
     
}
def lookupValues = lookupHashmap[essersReference]
if(lookupValues==null){
    
}
//println lookupValues
def lookupEntries = lookupValues ? lookupValues.split(",") : []
println lookupEntries

def parseEntry(entry) {
    def parts = entry.split("@")
    if (parts.size() == 2) {
        def statusCode = parts[0]
        def dateOnly = parts[1].split("T")[0]  // Extracting date without time
        return [statusCode: statusCode, date: dateOnly]
    }
    return null
}
def newEntry = parseEntry(data)

// Flag to check if new data should be added
boolean shouldAddNewData = true

// Check for matching entries based on status code and date
lookupEntries.each { entry ->
    def existingEntry = parseEntry(entry)
    if (existingEntry && existingEntry.statusCode == newEntry.statusCode && existingEntry.date == newEntry.date) {
        shouldAddNewData = false  // Found a matching entry, so we do not add new data
    }
}
println shouldAddNewData
// Concatenate and update if new data is unique
if (shouldAddNewData) {
    lookupEntries += data  // Add new data to entries list
    def updatedData = lookupEntries.join(",")  // Join entries with ","
    JTUtil.putLookupTableValueByToken(lookupToken, essersReference, updatedData)
} else {
    println "Duplicate entry found, not adding new data."
}
// def statusCode=lookupValues.split("@")
// println statusCode[0]
// println statusCode[1]

// // Create a Groovy map representing the JSON object
// def value = [
//     statusCode: "IO",
//     Time      : "2024-10-22T16:21:27"
// ]
 
// // Convert the map into a JSON string (only once)
// def jsonValue = JsonOutput.toJson(value)
 
// // Now, pass the plain JSON string (without additional escaping) to the lookup utility
// JTLookupUtil.putLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference, jsonValue)
 
// // Print for verification
// println jsonValue
 
 
 
// String input="""
//   {"statusCode":"IO","Time":"2024-10-22T16:21:27"}
// """
// def convertJSONStringToJSONObj(String input) {
//   JsonSlurper parser = new JsonSlurper()
//   def inputObj = parser.parseText(input)
//   return inputObj
// }
// def inputObj = convertJSONStringToJSONObj(input)
// JTLookupUtil.putLookupTableValue('7753326640424446848c8c7beec4eae6',essersReference, inputObj)//Get data from the Lookup table on the basis of key as string.
// //Table Name: Essers_Zonen N_V_Location_Status_Update, Creator Email: admin@fkcarriersent.com, Description: loadNumber and Statuscode
// println JTLookupUtil.getLookupTableValue('7753326640424446848c8c7beec4eae6', essersReference,"statusCode")



























