package Strings.Day_37;

import java.util.Arrays;

public class Rever_Word {
    public static void main(String[] args) {
        String s="I.am.Abhishek";
        String b=" the sky  is blue ";
        System.out.println(Revers(b));
       // System.out.println(Revers(s));
       
    }
    static String Revers(String s){
        s=s.trim();
       String st[]=s.split(" ");
        String str="";
        for(int i=st.length-1;i>=0;i--){
             if(st[i].isEmpty()) continue;
            // if(st[i]==" " )continue;
            str+=st[i];
            if(i!=0){
                str+=" ";
            }
        }
        return str;
    }
   
}
