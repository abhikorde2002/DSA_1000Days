

// CSV input
def csvInput = '''
    Load#, Cust #, Truck#, Trailer#, SCAC, Cell#
    "2024102","111323","","","FOURKITES","(251) 654-1196"
    "2024163","111323","","","FOURKITES","(847) 323-0744"
    "2024030","82529","115","","NVAL",""
    "2024029","82529","117","","NVAL",""
    "2023868","97149","","","FOURKITES","(484) 786-3030"
    "2023858","77935","","","FOURKITES","(647) 428-3737"
    "2023857","77935","","","FOURKITES","(647) 791-1268"
    "2023708","71356","","","FOURKITES","(236) 332-6321"
    "2023669","92992","1319","","RLAP",""
    "2023627","111323","E2371","NONE","ECMT",""
    "2023604","80469","1692","","FOURKITES",""
    "2023601","80469","1450","","FOURKITES",""
    "2023597","80469","1407","","FOURKITES",""
    "2023561","80825","596","596","FOURKITES",""
    "2023557","97149","","208","FOURKITES","(860) 371-7416"
    "2023448","85842","502","","LUZL",""
    "2023369","111323","","","FOURKITES","(862) 294-9905"
    "2023179","93086","","","FOURKITES","(416) 845-9902"
    "2023084","115395","","","FOURKITES","587-834-2217"
    "2022771","29584","733","","FOURKITES",""
    "2022648","115395","136","","FOURKITES",""
    "2021814","97149","","","FOURKITES","(313) 739-0409"
    "2021811","97149","","","FOURKITES","(248) 854-0991"
    "2021433","112265","1119","","MHNJ",""
    "2020328","98211","","","FOURKITES","(305) 304-9700"
    "2024028","82529","","","FOURKITES","(416) 997-8455"
    "2023957","85400","1208","","FOURKITES",""
    "2023954","85400","1136","","FOURKITES",""
    "2023945","71003","5066 ON #PA 93612","5066 ON #PA 936","DLHP",""
    "2023887","110807","138","138","FOURKITES",""
    "2023856","77935","239","","FOURKITES","(647) 272-7117"
    "2023850","107096","5001","","FOURKITES",""
    "2023844","77935","254","","FOURKITES","(647) 761-1268"
    "2023820","110807","114","114","FOURKITES",""
    "2023782","111588","5051 #PLATE PA54365","5051 #PLATE PA5","DLHP",""
    "2023767","111588","5063 ON #PA75058","","DLHP",""
    "2023650","113524","","","FOURKITES","(647) 203-9193"
    "2023623","111493","","","FOURKITES","(403) 465-2185"
    "2023589","111493","1401","NONE","FOURKITES",""
    "2023581","71356","","","FOURKITES","(778) 829-1451"
    "2023577","85842","216","216","FOURKITES",""
    "2023573","84002","770","770","RNST",""
    "2023572","84002","686","686","RNST",""
    "2023555","110786","","","FOURKITES","(317) 408-3504"
    "2023467","82186","203","","FOURKITES",""
    "2023458","82186","214","","FOURKITES",""
    "2023450","80825","4096","NONE","FOURKITES",""
    "2023442","82186","BB8-12","BB8-12","EEXH",""
    "2023418","97149","","","FOURKITES","(734) 218-2425"
    "2023397","86166","59924","59924","FOURKITES",""
    "2023395","5752","","","FOURKITES","(416) 545-9900"
    "2023384","5752","","","FOURKITES","(647) 949-8827"
    "2023379","5752","","","FOURKITES","(437) 922-9005"
    "2023365","111323","E2277","NONE","ECMT",""
    "2023304","96140","","","FOURKITES","(647) 551-6983"
    "2023262","70163","9009","","FOURKITES",""
    "2023213","29584","506","","KBCK",""
    "2022895","5752","7027","7027","ILKD","(780) 873-0302"
    "2022891","96834","","","FOURKITES","(773) 524-8635"
    "2022850","111323","","","FOURKITES","(410) 739-1854"
    "2022849","115395","8398","","FOURKITES",""
    "2022777","71356","","","FOURKITES","519-567-5157"
    "2022682","80825","139","NONE","FOURKITES",""
    "2022503","113524","","NONE","FOURKITES","(437) 755-4603"
    "2022502","115395","","","FOURKITES","."
    "2021809","97149","439","439","FOURKITES","(917) 714-1422"
    "2021523","107858","3004","3004","FOURKITES",""
    "2021431","112265","1123","1123","MHNJ",""
    "2021410","111065","1317","","RLAP",""
    "2021278","115395","145","142","FOURKITES","5142143733"
    "2018243","45057","5059 PLATE# PA70512","5059 PLATE# PA7","DLHP",""
    "2014610","122216","","","FOURKITES","(314) 295-7758"
    "2023789","113610","","","FOURKITES","(626) 616-5343"
    "2023701","97149","405","405","FOURKITES","(445) 205-6237"
    "2023678","71356","K427","","FOURKITES",""
    "2023664","86166","","","FOURKITES","(647) 655-6310"
    "2023617","111493","","","FOURKITES","(587) 436-6062"
    "2023548","80469","","","FOURKITES","(613) 920-3074"
    "2023546","80469","","","FOURKITES","(647) 271-2314"
    "2023545","80469","","","FOURKITES","(437) 218-8899"
    "2023539","80469","","NONE","FOURKITES","(647) 938-5383"
    "2023537","80469","","NONE","FOURKITES","(905) 782-8782"
    "2023472","29584","5065 ON #PA82399","5065 ON #PA8","DLHP",""
    "2023465","103406","120","120","FOURKITES",""
    "2023445","82186","","","FOURKITES","(519) 796-7372"
    "2023406","92950","1124","","HORI",""
    "2023404","92950","1140","","HORI",""
    "2023393","71003","","","FOURKITES","6479736089"
    "2023328","82624","102","102","FOURKITES",""
    "2023306","80825","113","NONE","FOURKITES",""
    "2023211","97149","","10193","FOURKITES","443-326-0765"
    "2023113","111323","","","FOURKITES","(475) 316-5969"
    "2022984","110807","407","000000","FOURKITES",""
    "2022917","113004","9280","9280","FOURKITES","(587) 830-5338"
    "2022861","93086","3008","3008","FOURKITES",""
    "2022848","111323","","","FOURKITES","(305) 684-6181"
    "2022844","111323","","","FOURKITES","(386) 225-5712"
    "2022842","111323","","","FOURKITES","(913) 709-2375"
    "2022835","80825","129","129","FOURKITES",""
    "2022757","107858","131","131","FOURKITES","(905) 867-9060"
'''

def outputs = [:]
// Split CSV into lines and remove header
def lines = csvInput.split('\n').drop(1)

// Process each line
def result = lines.collect { line ->
    def cols = line.split(',')
println(cols[0])
    def entry = [
            'Operation': 'add',
            'BillOfLading': cols[0].trim().replaceAll(/^"|"$/, ''), // Remove leading and trailing double quotes
            'Scac': cols[4].replaceAll(/^"|"$/, ''), // Remove leading and trailing double quotes
            'PartialLoadFlag': true
    ]
    if (!cols[2].isEmpty()) {
        entry.TruckNumber = cols[2].replaceAll(/^"|"$/, '') // Remove leading and trailing double quotes
    }
    if (!cols[3].isEmpty()) {
        entry.TrailerNumber = cols[3].replaceAll(/^"|"$/, '') // Remove leading and trailing double quotes
    }
    if (!cols[5].isEmpty()) {
        entry.DriverPhone = "+1"+ ""+  cols[5].replaceAll(/^"|"$/, '').replaceAll(/[\(\)\-\s]/, "") // Remove leading and trailing double quotes
    }
    entry.Stops = [:]
    entry
}

//println(result)
// Convert result to JSON
outputs.Loads = result
outputJson = new groovy.json.JsonBuilder(outputs)
print outputJson.toPrettyString()