package Complete_Heap.MAX_Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Sort_Char {
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }

    static String frequencySort(String s) {
       
    
        Map<Character,Integer> str=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            str.put(s.charAt(i), str.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> list= new ArrayList<>(str.keySet());
        list.sort((a,b) -> str.get(b)-str.get(a));

        String sort="";
        for (Character character : list) {
          int size= str.get(character);
            for (int i = 0; i < size; i++) {
                sort+=character;
            }
        }
        return sort;
        
    }
}
