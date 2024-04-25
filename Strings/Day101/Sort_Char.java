package Strings.Day101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort_Char {
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        if(s.length()==1){
            return s;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
        // we have to sort it character wise
        List<Character> sort_ch = new ArrayList<>(map.keySet());
        sort_ch.sort((a, b) -> map.get(b) - map.get(a));
         System.out.println(sort_ch);
        StringBuilder ans = new StringBuilder();
        for(char c : sort_ch){
            int freq = map.get(c);
            for(int i=0; i<freq; i++){
                ans.append(c);
            }
        } 
        return ans.toString();
    }
}
