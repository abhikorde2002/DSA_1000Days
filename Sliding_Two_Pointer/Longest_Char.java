package Sliding_Two_Pointer;

import java.util.HashMap;

public class Longest_Char {
   public static void main(String[] args) {
    String s= "12123";
    System.out.println(characterReplacement(s, 2));
   }
   
   static int characterReplacement(String s, int k) {
    int left=0,right=0;
    int max=0;
    int maxof=0;
    int sum=0;
    HashMap<Character,Integer> str= new HashMap<>();
    while(right<s.length()){
      
    str.put(s.charAt(right),str.getOrDefault(s.charAt(right),0)+1); 
     maxof=Math.max(maxof, str.get(s.charAt(right)));
      if(right-left+1-maxof>k) {
         str.put(s.charAt(left),str.get(s.charAt(left))-1);
         left++;
      }
    
        max=Math.max(max,right-left+1);  
     
     right++;
    }
    return max; 
   }
}
