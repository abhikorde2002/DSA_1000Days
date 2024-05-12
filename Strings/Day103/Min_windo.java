package Strings.Day103;

import java.util.Arrays;

public class Min_windo {
    public static void main(String[] args) {
     String s="ADOBECODEBANC";
     System.out.println(s.substring(0, 1)); 
    //  StringBuilder str= new StringBuilder(s);
    //  System.out.println(str);  
   // System.out.println(minWindow(s, "ABC"));
    // System.out.println(isSub(s, "ABC"));
    String t="ABC";
    System.out.println(minWindow(s, t));
    // System.out.println(isSub(s, t));
    }

    static String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        if(s.length() ==1 && t.length()==1){
            if(s.equals(t)){
                return s;
            }
            else{
                return "";
            }
        }
        int left=0,right=t.length()-1;
        String max="";
        while (right<s.length()) {
            String str=s.substring(left, right);
            if(isSub(str, t)){
             while(left<right &&isSub(str,t)){
                max=s.substring(left,right+1);
                left++;
             }
            }
            else{
                right++;
            }
        }
        return max;
   }
    
    static boolean isSub(String str, String t) {
        int cou=0;
           for (int i = 0; i < t.length(); i++) {
             for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==t.charAt(i)){
                    cou++;
                    break;
                }
             }
           }
  return cou==t.length()?true:false;
    }


}
