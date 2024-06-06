package Sliding_Two_Pointer.Rev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Long_Sub {
    public static void main(String[] args) {
    String s= "bbbbb";
    System.out.println(longest(s));
    System.out.println(longest_Sub(s));
    }
    
    static int longest_Sub(String s){
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        Map<Character,Integer> map= new HashMap<>();
        while (right<s.length()) {
          
            if (map.containsKey(s.charAt(right))) {
                left=Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            max= Math.max(max, right-left+1);
            right++;
        }
        return max;
    }


    static int longest(String s){
        Set<Character> str= new HashSet<>();
        int left=0;
        int right=0;
        int max=0;
       while (right<s.length()) {
         if (str.contains(s.charAt(right)) && left<=right) {
            while (str.contains(s.charAt(right))) {
                str.remove(s.charAt(left));
                left++;
            }
         }
         else{
            str.add(s.charAt(right));
            max=Math.max(max, right-left+1);
            right++;
         }
      
       }

       return max;
    }
}
