package Stack_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Reverse stack using que
public class Rev_Stack_Que {
    public static void main(String[] args) {
       Stack<Integer> s= new Stack<>();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.push(50);
       reverse(s); 
       System.out.println(s);
    }
    static void reverse(Stack<Integer> s) {
        Queue<Integer>  sr= new LinkedList<>();
        while (!s.isEmpty()) {
            sr.add(s.pop());
        }
      //  System.out.println(sr);
        while (!sr.isEmpty()) {
            s.push(sr.remove());
        }
       // System.out.println(s);
    }
}
