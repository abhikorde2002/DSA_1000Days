package Stack_Queue;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack Before Revers :- " + s);
        System.out.println("Stack After  Revers :- " +Rev(s));
        
    }

    static Stack<Integer> Rev(Stack<Integer> s) {
        Stack<Integer> a= new Stack<>();
        while (!s.isEmpty()) {
            a.push(s.pop());
        }
        return a;
    }
}
