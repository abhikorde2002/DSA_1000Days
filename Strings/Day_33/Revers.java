package Strings.Day_33;

import java.util.Arrays;

public class Revers {
    public static void main(String[] args) {
       revers("20-3+5*2"); 
       char ch[]={'h','e','l','l','o'};
       Rev(ch);
       Cyclic("20-3+5*2");
    }

    static void Cyclic(String s){
         char[] ch=s.toCharArray();
         String str="";
        for(int i=0;i<s.length();i++){
            char tem=ch[i];
            ch[i]=ch[s.length()-1];
            ch[s.length()-1]=tem;
            
        }
        System.out.println(Arrays.toString(ch));
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
