package Stack_Queue;

import java.util.Stack;

public class Min_Add_Make_Valid {
  public static void main(String[] args) {
    System.out.println(minAddToMakeValid("())"));
  } 
  
  public static int minAddToMakeValid(String s) {
       Stack<Character> str= new Stack<>();
        
        for(char ch: s.toCharArray()){
            if(ch==')'){
                if(!str.isEmpty() && str.peek()=='('){
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
