package Strings.Day_36;

import java.util.ArrayList;
//Print all subsequences of a string
public class SubSeq {
       static ArrayList<String> sh= new ArrayList<>();
    public static void main(String[] args) {
        String s="aabc";
        Print(s);
        System.out.println(sh);
    }

    static void Print(String str){
    
        for(int i=0;i<str.length();i++){
            for(int j=str.length();j>i;j--){
                String sr= str.substring(i, j);
                if(!sh.contains(sr)){
                    sh.add(sr);
                }

                for (int k = 1; k < sr.length() - 1;
                k++) {
               StringBuffer sb
                   = new StringBuffer(sr);

               // Drop character from the string
               sb.deleteCharAt(k);
               if (!sh.contains(sb))
                   
               Print(sb.toString());
           }
            }
        }
    
    }
}
