package Strings.Day_37;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s="abcdeabsd";
        String str="sfasdfasf";
       System.out.println(Sort(s,str));
    }

     static boolean Sort(String s,String b){
        char[] str=s.toCharArray();
        Arrays.sort(str);
        char []a=b.toCharArray();
        Arrays.sort(a);
        if(s.length()!=b.length()){
            return false;
        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(a));
        for(int i=0;i<s.length();i++){
            if(str[i]!=a[i]){
                return false;
            }
        }
        return true;
        // String sr="";
        // sr=str.toString();
        // System.out.println(Arrays.toString(str));

    }
}
