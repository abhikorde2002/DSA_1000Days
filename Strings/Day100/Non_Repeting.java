package Strings.Day100;

import java.util.HashMap;
//Non Repeating Character
//Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.
public class Non_Repeting {
    public static void main(String[] args) {
        String s="uhgxusrtgqitrtpiuqxmpdmyumdputxumlxnrnfwgeuslwdysxhucykkmzfdourroagoan";
        System.out.println(Repeting(s));
    }

    static char Repeting(String s){
       HashMap<Character,Integer> str= new HashMap<>();

       for (int i = 0; i < s.length(); i++) {
            str.put(s.charAt(i), str.getOrDefault(s.charAt(i), 0)+1);
       }
       System.out.println(str);
       for (int i = 0; i < s.length(); i++) {
         if(str.get(s.charAt(i))==1){
            return s.charAt(i);
         }
       }
       return '$';
    }

}
