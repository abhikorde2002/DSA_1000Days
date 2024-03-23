package Stack_Queue;

import java.util.Stack;

public class Min_Stack {
    public static void main(String[] args) {
        // Stack<Character> s= new Stack<>();
        // s.push('(');
        // s.push('(');
        // s.push(')');
        // Stack<Character> str=s;
        // System.out.println(str);
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s);
       System.out.println( getMin());
        pop();
        System.out.println(top());
        System.out.println(getMin());

    }

   static Stack<Integer> s= new Stack<>();
   
    
    public static void push(int val) {
        s.push(val);
    }
    
    public static void pop() {
       System.out.println( s.pop());
    }
    
    public static int top() {
      return s.peek();  
    }
    
    public static int getMin() {
       Stack<Integer> str= s;
       int ans=Integer.MAX_VALUE;
       for(int a:str){
           ans=Math.min(a, ans);
       }
       return ans;
    }
}
