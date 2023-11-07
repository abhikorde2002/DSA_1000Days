package Strings.Day_35;

import java.util.Arrays;

public class Longest_Rep_Subeq {
    public static void main(String[] args) {
        String str="axxxxb";
        System.out.println(SubSequence(str));
    }

    static int SubSequence(String str){
         char []ch=str.toCharArray();
         Arrays.sort(ch);
         String s= new String(ch);
         int count=1;
        for(int i=0;i<str.length();i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            // while (i<s.length()-1 && str.charAt(i)==s.charAt(i+1)){
            //     i++;
            //     count++;
            // }
        }
        return count%2==0 ?count : count-1;
    }
}
