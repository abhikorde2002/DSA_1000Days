package Strings.Day_37;

import java.util.Arrays;

public class Rever_Word {
    public static void main(String[] args) {
        String s="I.am.Abhishek";
        System.out.println(Revers(s));
       
    }
    static String Revers(String s){
        String st[]=s.split("\\.");
        String str="";
        for(int i=st.length-1;i>=0;i--){
            str+=st[i];
            if(i!=0){
                str+=".";
            }
        }
        return str;
    }
   
}
