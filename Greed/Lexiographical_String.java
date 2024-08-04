package Greed;

import java.util.Stack;

public class Lexiographical_String {
    public static void main(String[] args) {
  String s="()";
  //(((((()*)(*)*))())())(()())())))((**)))))(()())()
  System.out.println(stack_Logic(s));
 //System.out.println(isValid(s));
    }

    public static boolean stack_Logic(String s){
        Stack<Integer> st= new Stack<>();
        Stack<Integer> stack= new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                st.push(i);
            }
            else if(s.charAt(i)=='*'){
                stack.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                   return false;
                }}}
        while (!st.isEmpty() && !stack.isEmpty() ) {
            if(st.peek()<stack.peek()){
                st.pop();
                stack.pop();
            }
            else{
                return false;
            } 
        }
        return st.isEmpty();
    }
    public static boolean checkValidString(String s) {
        int left=0;
       int star=0;
       for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='('){
               left++;
               star++;
           }
           else if(s.charAt(i)==')'){
               left--;
               star--;
           }
            else if (s.charAt(i)=='*') {
               star++;
               left--;
           }
           if(star<0){
                return false;
               }
               if(left<0){
                left=0;
               }
        
       }
       return  (left==0) ? true : false; 
   }
   
}
