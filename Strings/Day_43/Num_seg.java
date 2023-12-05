package Strings.Day_43;

import java.util.StringTokenizer;

public class Num_seg {
    public static void main(String[] args) {
        String s=", , , ,        a, eaefa";
        System.out.println(countSegment(s));
        System.out.println(token(s));
    }

    static int countSegment(String str){
        int count=1;
        str=str.trim();
        if(str.isEmpty()){
            return 0;
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }

    static int token(String s){
        StringTokenizer str= new StringTokenizer(s," ");
        int cou=0;
        while (str.hasMoreTokens()) {
            cou++;
            str.nextToken();
        }
        return cou;
    }
}
