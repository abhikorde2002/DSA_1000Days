package Stack_Queue;
//921. Minimum Add to Make Parentheses Valid

import java.util.Stack;

public class ValidMin {
    
    public static void main(String[] args) {
        System.out.println(min("][]["));
    }

    public static int min(String s) {
        Stack<Character> str= new Stack<>();
         
         for(char ch: s.toCharArray()){
             if(ch==']'){
                 if(!str.isEmpty() && str.peek()=='['){
                     str.pop();
                 }
                 else{
                     str.push(ch);
                 }
             }
             else{
                 str.push(ch);
             }
         } 
         return str.size();     
     }
}
