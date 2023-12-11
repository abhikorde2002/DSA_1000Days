package Strings.Day_45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagram {
    public static void main(String[] args) {
        String str[]= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Anagram(str));
    }

    static List<List<String>> Anagram(String[] s){
        if(s.length==0){
            return new ArrayList<>();
        } 
        Map<String,List<String>> str= new HashMap<>();
        
        
        
        for (String word:s) {
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String sb= String .valueOf(ch);
            if(!str.containsKey(sb)){
                str.put(sb,new ArrayList<>());
            }
            str.get(sb).add(word);
        }
        return new ArrayList<>(str.values());

    }
}
