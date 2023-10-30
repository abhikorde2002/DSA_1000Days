package Strings.Day_34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Duplicate{

    public static void main(String[] args) {
        Duplicates("I am Abhishek Korde");
        s("I am Abhishek Korde");
    }
    static void Duplicates(String s){
         char ch[]= s.toCharArray();
         Arrays.sort(ch);
         String str= new String(ch);
        for(int i=0;i<s.length();i++){
           int count=1;
            while (i<s.length()-1 && str.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            if(count>1){
                System.out.println(s.charAt(i) + " "+count);
            }
        }
    }

   static void s(String str){
      Map<Character,Integer> sb= new HashMap<>();
      for(int i=0;i<str.length();i++){
         if(sb.containsKey(str.charAt(i))){
            sb.put(str.charAt(i),sb.get(str.charAt(i))+1);
         }
         else{
            sb.put(str.charAt(i),1);
         }
      }
      for (Map.Entry<Character,Integer> mapElement : sb.entrySet()) {   //iterating through the unordered map 
        if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
          System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
      }
   }
 }