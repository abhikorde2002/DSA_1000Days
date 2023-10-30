package Strings.Day_33;

import java.util.Arrays;

public class Revers {
    public static void main(String[] args) {
       revers("Abhi"); 
       char ch[]={'h','e','l','l','o'};
       Rev(ch);
    }

    static void revers(String s){
         String str="";
         char ch;
         for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            str= ch+str;
         }
         System.out.println(" Revers String is : "+ str);
    }
    static void Rev(char s[]){
        int a=0,b=s.length-1;
        while(a<b){
            char tem=s[a];
            s[a]=s[b];
            s[b]=tem;
            a++;
            b--;
        }
         System.out.println(" Revers String is : "+Arrays.toString(s));
    }
}
