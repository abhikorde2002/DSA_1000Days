package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    static List<String> str= null;
    public static void main(String[] args) {
        str= new ArrayList<>();
       // pad("", "7");
       // System.out.println(str);
       System.out.println(pads("", "12"));
    }
    
    static void pad(String p, String up) {
        if (up. isEmpty()) {
        str.add(p);
        return;
        }
        int digit = up.charAt(0) - '1'; 
        for (int i = (digit - 1) * 3; i<digit * 3; i++) {
        char ch = (char) ('a' + i);
        pad( p + ch, up.substring(1));
        }
    }
    static ArrayList<String> pads(String p, String up) {
        if (up. isEmpty()) {
            ArrayList<String> str= new ArrayList<>();
            str.add(p);
            return str;
        }
        int digit = up.charAt(0) - '0'; 
        ArrayList<String> left= new ArrayList<>();
        for (int i = (digit - 1) * 3; i<digit * 3; i++) {
        char ch = (char) ('a' + i);
        left.addAll(pads( p + ch, up.substring(1)));
        }
        return left;
    } 
    static List<String> res = null;
    String [] strMap = {"0","1","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   public List<String> letterCombinations(String digits) {
       res= new ArrayList<>();
       if(digits.length()==0){
           return res;
       }
       print(0,digits,new StringBuilder());
       return res;
   }

   void print(int len, String s, StringBuilder str){
     if(len==s.length()){
         res.add(str.toString());
         return ;
     }
     char ch= s.charAt(len);
     String st= strMap[ch-'0'];

     for(char c:st.toCharArray()){
         str.append(c);
         print(len+1 , s,str);
         str.deleteCharAt(str.length()-1);
     }
   }  
}
