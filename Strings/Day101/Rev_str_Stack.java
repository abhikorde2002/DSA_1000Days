package Strings.Day101;

import java.util.Stack;

public class Rev_str_Stack {
    public static void main(String[] args) {
        String s="Abhi";
        System.out.println(Revers(s));
    }
    
   static String Revers(String s){
    Stack<Character> str= new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        str.push(s.charAt(i));
    }
    String b="";
    while (!str.isEmpty()) {
        b+=str.pop();
    }
    return b;
   }
}
