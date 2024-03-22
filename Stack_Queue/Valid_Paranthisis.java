package Stack_Queue;

import java.util.Stack;

public class Valid_Paranthisis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

     static boolean isValid(String s){
       Stack<Character> str= new Stack<>();

       for(char ch:s.toCharArray()){
        if(ch=='(' || ch=='{' || ch=='['){
            str.push(ch);
        }
        else{
            if(ch=='}' ){
                if(str.isEmpty() || str.pop()!= '{'){
                    return false;
                }
            }
            if(ch== ']'){
                if( str.isEmpty()|| str.pop() != '['){
                    return false;
                }
            }
             if(ch== ')'){
                if( str.isEmpty()|| str.pop() != '('){
                    return false;
                }
            }
        }
       }
       return str.isEmpty();
    }
}
