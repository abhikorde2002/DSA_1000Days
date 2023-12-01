package Strings.Day_37;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s="anagram";
        String str="nagaram";
       System.out.println(Sort(s,str));
       System.out.println(Sorts(s, str));
       System.out.println(sort(s, str));
    }

     static boolean Sort(String s,String b){
        char[] str=s.toCharArray();
        Arrays.sort(str);
        char []a=b.toCharArray();
        Arrays.sort(a);
        if(s.length()!=b.length()){
            return false;
        }
        // System.out.println(Arrays.toString(str));
        // System.out.println(Arrays.toString(a));
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
    static boolean Sorts(String s,String t){
        char c[]=s.toCharArray();
        char x[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(x);
        return Arrays.equals(c,x);
    }

    static boolean sort(String s, String b){
        Map<Character ,Integer> m= new HashMap<>();

        for(char x: s.toCharArray()){
            m.put(x,m.getOrDefault(x, 0)+1);
        }
        for(char y: b.toCharArray()){
            m.put(y, m.getOrDefault(y, 0)-1);
        }

        for(int val:m.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
