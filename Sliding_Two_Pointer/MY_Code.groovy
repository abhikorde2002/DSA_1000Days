
import groovy.json.JsonOutput
import groovy.xml.XmlSlurper

import java.time.LocalDateTime
//utz-quality-foods-llc
//import groovy.util.XmlParser

def XmlString='''<load>
\t<trackingId>408436882</trackingId>
\t<loadNumber>172758159_1667851101</loadNumber>
\t<carrier>RBTW</carrier>
\t<carrierInfo>
\t\t<name>UTZ LOGIN</name>
\t\t<email>UTZ@chrobinson.com</email>
\t</carrierInfo>
\t<proNumber>1629504024</proNumber>
\t<trackingInfo>
\t\t<trailerNumber>PENDING</trailerNumber>
\t</trackingInfo>
\t<referenceNumbers>
\t\t<referenceNumber>
\t\t\t<type>Equipment Type</type>
\t\t\t<value>Van</value>
\t\t</referenceNumber>
\t\t<referenceNumber>
\t\t\t<type>ID #</type>
\t\t\t<value>172758159</value>
\t\t</referenceNumber>
\t\t<referenceNumber>
\t\t\t<type>Load Group</type>
\t\t\t<value>240 KINDIG</value>
\t\t</referenceNumber>
\t\t<referenceNumber>
\t\t\t<type>PRO #</type>
\t\t\t<value>1629504024</value>
\t\t</referenceNumber>
\t</referenceNumbers>
\t<stops>
\t\t<stop>
\t\t\t<stopReferenceId>378110646</stopReferenceId>
\t\t\t<stopType>pickup</stopType>
\t\t\t<name>UTZ QUALITY FOODS - 240 KINDIG HANOVER, PA</name>
\t\t\t<addressLine1>240 KINDIG LANE</addressLine1>
\t\t\t<city>HANOVER</city>
\t\t\t<state>PA</state>
\t\t\t<postalCode>17331</postalCode>
\t\t\t<country>US</country>
\t\t\t<latitude>39.800655</latitude>
\t\t\t<longitude>-76.983036</longitude>
\t\t\t<timezoneOffset>-14400</timezoneOffset>
\t\t\t<geofenceRadius>750</geofenceRadius>
\t\t\t<earliestAppointmentTime>2024-03-22T22:00:00</earliestAppointmentTime>
\t\t\t<latestAppointmentTime>2024-03-22T22:00:00</latestAppointmentTime>
\t\t\t<planDate>2024-03-22T00:00:00</planDate>
\t\t\t<sequenceNumber>0</sequenceNumber>
\t\t\t<serviceLevel>TL STANDARD</serviceLevel>
\t\t\t<mode>TL</mode>
\t\t\t<referenceNumbers>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t<value>5631570767</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t<value>5631570770</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Load ID</type>
\t\t\t\t\t<value>172758159</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Loading Type</type>
\t\t\t\t\t<value>LIVE</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Location Ref #</type>
\t\t\t\t\t<value>W2240</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t<value>S026360143</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t<value>S026360756</value>
\t\t\t\t</referenceNumber>
\t\t\t</referenceNumbers>
\t\t\t<products>
\t\t\t\t<product>
\t\t\t\t\t<productID>19132</productID>
\t\t\t\t\t<productName>16 oz GH Veg Stix - PLT</productName>
\t\t\t\t\t<packageQuantity>480</packageQuantity>
\t\t\t\t\t<ladingQuantity>2.0</ladingQuantity>
\t\t\t\t\t<weight>480.0</weight>
\t\t\t\t\t<volume>85.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>2240</productID>
\t\t\t\t\t<productName>60 oz Utz Mini Twist Pretzel Brl - Red</productName>
\t\t\t\t\t<packageQuantity>1104</packageQuantity>
\t\t\t\t\t<ladingQuantity>6.0</ladingQuantity>
\t\t\t\t\t<weight>4140.0</weight>
\t\t\t\t\t<volume>673.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>30279</productID>
\t\t\t\t\t<productName>52 oz Utz Special Brl - Red</productName>
\t\t\t\t\t<packageQuantity>736</packageQuantity>
\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t<weight>2392.0</weight>
\t\t\t\t\t<volume>448.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>31278</productID>
\t\t\t\t\t<productName>40.75 oz Utz Variety Pk Chip 42 Ct - Red</productName>
\t\t\t\t\t<packageQuantity>72</packageQuantity>
\t\t\t\t\t<ladingQuantity>1.0</ladingQuantity>
\t\t\t\t\t<weight>370.8</weight>
\t\t\t\t\t<volume>115.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>37275</productID>
\t\t\t\t\t<productName>28 oz Utz Chzball Brl</productName>
\t\t\t\t\t<packageQuantity>2600</packageQuantity>
\t\t\t\t\t<ladingQuantity>13.0</ladingQuantity>
\t\t\t\t\t<weight>4550.0</weight>
\t\t\t\t\t<volume>1472.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>55272</productID>
\t\t\t\t\t<productName>44 oz Utz Pub Mix Brl</productName>
\t\t\t\t\t<packageQuantity>1792</packageQuantity>
\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t<weight>4928.0</weight>
\t\t\t\t\t<volume>435.0</volume>
\t\t\t\t</product>
\t\t\t</products>
\t\t\t<nonFacilityCustomers>
\t\t\t\t<nonFacilityCustomer>
\t\t\t\t\t<customerReference>CA3758</customerReference>
\t\t\t\t\t<customerName>SAM'S CLUB - DTW</customerName>
\t\t\t\t\t<poNumbers>5631570767, 5631570770</poNumbers>
\t\t\t\t\t<referenceNumbers>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t\t\t<value>5631570767</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t\t\t<value>5631570770</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t\t\t<value>S026360143</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t\t\t<value>S026360756</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t</referenceNumbers>
\t\t\t\t\t<products>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>19132</productID>
\t\t\t\t\t\t\t<productName>16 oz GH Veg Stix - PLT</productName>
\t\t\t\t\t\t\t<packageQuantity>480</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>2.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>480.0</weight>
\t\t\t\t\t\t\t<volume>85.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>2240</productID>
\t\t\t\t\t\t\t<productName>60 oz Utz Mini Twist Pretzel Brl - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>1104</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>6.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4140.0</weight>
\t\t\t\t\t\t\t<volume>673.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>30279</productID>
\t\t\t\t\t\t\t<productName>52 oz Utz Special Brl - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>736</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>2392.0</weight>
\t\t\t\t\t\t\t<volume>448.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>31278</productID>
\t\t\t\t\t\t\t<productName>40.75 oz Utz Variety Pk Chip 42 Ct - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>72</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>1.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>370.8</weight>
\t\t\t\t\t\t\t<volume>115.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>37275</productID>
\t\t\t\t\t\t\t<productName>28 oz Utz Chzball Brl</productName>
\t\t\t\t\t\t\t<packageQuantity>2600</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>13.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4550.0</weight>
\t\t\t\t\t\t\t<volume>1472.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>55272</productID>
\t\t\t\t\t\t\t<productName>44 oz Utz Pub Mix Brl</productName>
\t\t\t\t\t\t\t<packageQuantity>1792</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4928.0</weight>
\t\t\t\t\t\t\t<volume>435.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t</products>
\t\t\t\t</nonFacilityCustomer>
\t\t\t</nonFacilityCustomers>
\t\t</stop>
\t\t<stop>
\t\t\t<stopReferenceId>378110647</stopReferenceId>
\t\t\t<stopType>delivery</stopType>
\t\t\t<name>SAMS DIST CENTER</name>
\t\t\t<addressLine1>3010 SADDLE CREEK RD BLDG 19</addressLine1>
\t\t\t<city>LAKELAND</city>
\t\t\t<state>FL</state>
\t\t\t<postalCode>33801</postalCode>
\t\t\t<country>US</country>
\t\t\t<latitude>28.048611</latitude>
\t\t\t<longitude>-81.898908</longitude>
\t\t\t<timezoneOffset>-14400</timezoneOffset>
\t\t\t<geofenceRadius>750</geofenceRadius>
\t\t\t<earliestAppointmentTime>2024-03-26T07:30:00</earliestAppointmentTime>
\t\t\t<latestAppointmentTime>2024-03-26T07:30:00</latestAppointmentTime>
\t\t\t<planDate>2024-03-24T00:00:00</planDate>
\t\t\t<sequenceNumber>1</sequenceNumber>
\t\t\t<serviceLevel>TL STANDARD</serviceLevel>
\t\t\t<mode>TL</mode>
\t\t\t<customer>
\t\t\t\t<pointOfContact>
\t\t\t\t\t<phone>863-667-1136</phone>
\t\t\t\t</pointOfContact>
\t\t\t</customer>
\t\t\t<referenceNumbers>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t<value>5631570767</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t<value>5631570770</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Load ID</type>
\t\t\t\t\t<value>172758159</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Loading Type</type>
\t\t\t\t\t<value>LIVE</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Location Ref #</type>
\t\t\t\t\t<value>C001082750</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t<value>S026360143</value>
\t\t\t\t</referenceNumber>
\t\t\t\t<referenceNumber>
\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t<value>S026360756</value>
\t\t\t\t</referenceNumber>
\t\t\t</referenceNumbers>
\t\t\t<products>
\t\t\t\t<product>
\t\t\t\t\t<productID>19132</productID>
\t\t\t\t\t<productName>16 oz GH Veg Stix - PLT</productName>
\t\t\t\t\t<packageQuantity>480</packageQuantity>
\t\t\t\t\t<ladingQuantity>2.0</ladingQuantity>
\t\t\t\t\t<weight>480.0</weight>
\t\t\t\t\t<volume>85.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>2240</productID>
\t\t\t\t\t<productName>60 oz Utz Mini Twist Pretzel Brl - Red</productName>
\t\t\t\t\t<packageQuantity>1104</packageQuantity>
\t\t\t\t\t<ladingQuantity>6.0</ladingQuantity>
\t\t\t\t\t<weight>4140.0</weight>
\t\t\t\t\t<volume>673.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>30279</productID>
\t\t\t\t\t<productName>52 oz Utz Special Brl - Red</productName>
\t\t\t\t\t<packageQuantity>736</packageQuantity>
\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t<weight>2392.0</weight>
\t\t\t\t\t<volume>448.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>31278</productID>
\t\t\t\t\t<productName>40.75 oz Utz Variety Pk Chip 42 Ct - Red</productName>
\t\t\t\t\t<packageQuantity>72</packageQuantity>
\t\t\t\t\t<ladingQuantity>1.0</ladingQuantity>
\t\t\t\t\t<weight>370.8</weight>
\t\t\t\t\t<volume>115.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>37275</productID>
\t\t\t\t\t<productName>28 oz Utz Chzball Brl</productName>
\t\t\t\t\t<packageQuantity>2600</packageQuantity>
\t\t\t\t\t<ladingQuantity>13.0</ladingQuantity>
\t\t\t\t\t<weight>4550.0</weight>
\t\t\t\t\t<volume>1472.0</volume>
\t\t\t\t</product>
\t\t\t\t<product>
\t\t\t\t\t<productID>55272</productID>
\t\t\t\t\t<productName>44 oz Utz Pub Mix Brl</productName>
\t\t\t\t\t<packageQuantity>1792</packageQuantity>
\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t<weight>4928.0</weight>
\t\t\t\t\t<volume>435.0</volume>
\t\t\t\t</product>
\t\t\t</products>
\t\t\t<nonFacilityCustomers>
\t\t\t\t<nonFacilityCustomer>
\t\t\t\t\t<customerReference>CA3758</customerReference>
\t\t\t\t\t<customerName>SAM'S CLUB - DTW</customerName>
\t\t\t\t\t<poNumbers>5631570767, 5631570770</poNumbers>
\t\t\t\t\t<referenceNumbers>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t\t\t<value>5631570767</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Customer PO</type>
\t\t\t\t\t\t\t<value>5631570770</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t\t\t<value>S026360143</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t\t<referenceNumber>
\t\t\t\t\t\t\t<type>Shipment Ref #</type>
\t\t\t\t\t\t\t<value>S026360756</value>
\t\t\t\t\t\t</referenceNumber>
\t\t\t\t\t</referenceNumbers>
\t\t\t\t\t<products>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>19132</productID>
\t\t\t\t\t\t\t<productName>16 oz GH Veg Stix - PLT</productName>
\t\t\t\t\t\t\t<packageQuantity>480</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>2.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>480.0</weight>
\t\t\t\t\t\t\t<volume>85.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>2240</productID>
\t\t\t\t\t\t\t<productName>60 oz Utz Mini Twist Pretzel Brl - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>1104</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>6.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4140.0</weight>
\t\t\t\t\t\t\t<volume>673.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>30279</productID>
\t\t\t\t\t\t\t<productName>52 oz Utz Special Brl - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>736</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>2392.0</weight>
\t\t\t\t\t\t\t<volume>448.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>31278</productID>
\t\t\t\t\t\t\t<productName>40.75 oz Utz Variety Pk Chip 42 Ct - Red</productName>
\t\t\t\t\t\t\t<packageQuantity>72</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>1.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>370.8</weight>
\t\t\t\t\t\t\t<volume>115.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>37275</productID>
\t\t\t\t\t\t\t<productName>28 oz Utz Chzball Brl</productName>
\t\t\t\t\t\t\t<packageQuantity>2600</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>13.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4550.0</weight>
\t\t\t\t\t\t\t<volume>1472.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t\t<product>
\t\t\t\t\t\t\t<productID>55272</productID>
\t\t\t\t\t\t\t<productName>44 oz Utz Pub Mix Brl</productName>
\t\t\t\t\t\t\t<packageQuantity>1792</packageQuantity>
\t\t\t\t\t\t\t<ladingQuantity>4.0</ladingQuantity>
\t\t\t\t\t\t\t<weight>4928.0</weight>
\t\t\t\t\t\t\t<volume>435.0</volume>
\t\t\t\t\t\t</product>
\t\t\t\t\t</products>
\t\t\t\t</nonFacilityCustomer>
\t\t\t</nonFacilityCustomers>
\t\t</stop>
\t</stops>
</load>
'''

def xmlSlurper = new XmlSlurper()
def xmlNode = xmlSlurper.parseText(XmlString)
def payload = xmlNode

// Define helper functions



// Get Display Load Number
//  def displayLoadNumber = payload.loadNumber.takeBefore("_")

// Get Load Number

// Get Display Load Number


// Get Load Number
def loadNumber = payload.loadNumber

// Tracking ID showing 0 for all loads. If 0, mark as null.
def trackingNumber = payload.trackingId == "0" ? null : payload.trackingId

// Get all Stops with stopType = pickup
def pickupStopsMap = payload.stops.stop.findAll { it.stopType == "pickup" }

// Get all Stops with stopType = delivery
def deliveryStopsMap = payload.stops.stop.findAll { it.stopType == "delivery" }

// Filter for PRO # and ID # Load Level Reference Numbers
def loadReferenceNumbers = payload.referenceNumbers.referenceNumber.findAll {
    it.type == "PRO #" || it.type == "ID #"
}.collect { it.value }

// Find Carrier Contact Information
def carrierContactName = payload.carrierInfo.name ?: []
def carrierContactEmail = payload.carrierInfo.email ?: []
def carrierContactPhone = payload.carrierInfo.phone ?: []

// Filter for Load Group and Equipment Type Tags
def tags = payload.referenceNumbers.referenceNumber.findAll {
    it.type == "Load Group" || it.type == "Equipment Type"
}.collect { it.value }

// Find the load priority
def priority = payload.priority ?: "normal"

// Find all Product IDs
def productIds = payload.stops.stop.products.product.collect { it.productID ?: [] }.flatten()

// Get pickup stop details
def pickupStopDetails = pickupStopsMap.collect { stop ->
    [
            stop_id: stop.stopReferenceId ?: "",
            customer: [
                    id: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
                    po_numbers: stop.referenceNumbers.referenceNumber.findAll { it.type == 'Customer PO' }.collect { it.value }.flatten()?.unique()
            ],
            ship_to: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
            location: stop.name,
            sequence: stop.sequenceNumber ?: "",
            address_line_1: stop.addressLine1 ?: "",
            city: stop.city ?: "",
            state: stop.state ?: "",
            country: stop.country ?: "",
            postal: stop.postalCode ?: "",
            external_address_id: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
            earliest_arrival_time: stop.earliestAppointmentTime ?: "",
            latest_arrival_time: stop.latestAppointmentTime ?: "",
            reference_numbers: stop.referenceNumbers.referenceNumber.findAll { it.type != 'Customer PO' }.collect { it.value }.flatten()?.unique(),
            pallets: [
                    parts: stop.products.product.collect {
                        [
                                quantity: it.packageQuantity,
                                weight: it.weight,
                                customerPartNumber: it.productName,
                                shipperPartNumber: it.productID
                        ]
                    }
            ]
    ]
}

// Get delivery stop details
def deliveryStopDetails = deliveryStopsMap.collect { stop ->
    [
            stop_id: stop.stopReferenceId ?: "",
            customer: [
                    id: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
                    po_numbers: stop.referenceNumbers.referenceNumber.findAll { it.type == 'Customer PO' }.collect { it.value }.flatten()?.unique()
            ],
            ship_to: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
            location: stop.name,
            sequence: stop.sequenceNumber ?: "",
            address_line_1: stop.addressLine1 ?: "",
            city: stop.city ?: "",
            state: stop.state ?: "",
            country: stop.country ?: "",
            postal: stop.postalCode ?: "",
            external_address_id: stop.referenceNumbers.referenceNumber.findAll { it.type == "Location Ref #" }.collect { it.value }.flatten()?.join(),
            earliest_arrival_time: stop.earliestAppointmentTime ?: "",
            latest_arrival_time: stop.latestAppointmentTime ?: "",
            reference_numbers: stop.referenceNumbers.referenceNumber.findAll { it.type != 'Customer PO' }.collect { it.value }.flatten()?.unique(),
            pallets: [
                    parts: stop.products.product.collect {
                        [
                                quantity: it.packageQuantity,
                                weight: it.weight,
                                customerPartNumber: it.productName,
                                shipperPartNumber: it.productID
                        ]
                    }
            ]
    ]
}

def jsonOutput = [
        Loads: [
                [
                        BillOfLading: payload.loadNumber,
                        Operation: "add",
                        DriverPhone: payload.trackingInfo.driverPhone ?: "",
                        Scac: payload.carrier,
                        LoadReferenceNumbers: (loadReferenceNumbers ?: []) + (carrierContactName ?: []) + (carrierContactEmail ?: []) + (carrierContactPhone ?: []),
                        Priority: priority,
                        ProNumber: payload.proNumber ?: null,
                        Stops: [
                                PickupStops: pickupStopDetails,
                                DeliveryStops: deliveryStopDetails
                        ],
                        TrackingNumber: trackingNumber,
                        Tags: tags ?: []
                ]
        ]
]

println jsonOutput




//You can replace the `inputXml` variable with your actual XML data and execute the script to get the JSON output.