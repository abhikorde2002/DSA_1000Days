package LeetCode_Contest.String;

import java.util.Arrays;

public class Com_SubString {
    public static void main(String[] args) {
        String s="aaabbbccc";
        int k=3;
        System.out.println(Sub_String(s, k));
    }

    static int Sub_String(String s,int k){
       int num=0;
       for(int i=0;i<s.length()-1;i++){
        int cou=1;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        
        if(ch[i]==ch[i+1]){
            cou++;
        }
        System.out.println(cou);
        if(cou==k){
           num++;
        }
       }
       return num;
    }
}
