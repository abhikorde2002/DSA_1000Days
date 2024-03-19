package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;

public class Subseq_String {
    public static void main(String[] args) {
        Subset("abc", "");
      // Ascii("abc", "");
        //System.out.println(SubsetS("abc", ""));
    }
   

    static void Subset(String s,String p){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= s.charAt(0);
        Subset(s.substring(1), p+ch);
        Subset(s.substring(1), p);

        
    }
    static ArrayList<String> SubsetS(String s,String p){
        if(s.isEmpty()){
            ArrayList<String> str= new ArrayList<>();
            str.add(p);
            return str;
        }
        char ch= s.charAt(0);
        ArrayList<String> left= SubsetS(s.substring(1), p+ch);
        ArrayList<String>  right=SubsetS(s.substring(1), p);

        left.addAll(right);
        return left;
        
    }   
    static void Ascii(String s,String p){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= s.charAt(0);
        Ascii(s.substring(1), p+ch);
        Ascii(s.substring(1), p);
        Ascii(s.substring(1), p+(ch+0));
    }

}
