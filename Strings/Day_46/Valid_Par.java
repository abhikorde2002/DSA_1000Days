package Strings.Day_46;

import java.util.Stack;

public class Valid_Par {
    
    public static void main(String[] args) {
        String s="{([])}";
        System.out.println(ispar(s));
    }

    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s= new Stack<>();
        for(char ch:x.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                s.push(ch);
            }
            else{
                if(ch=='}'){
                    if(s.isEmpty() || s.pop()!='{'){
                     return false;
                    }
                }
                 if(ch==']'){
                    if(s.isEmpty() || s.pop()!='['){
                     return false;
                    }
                } if(ch==')'){
                    if(s.isEmpty() || s.pop()!='('){
                     return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }
}
