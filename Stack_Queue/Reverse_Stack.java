package Stack_Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse_Stack {

    /*
 St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
     */
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack Before Revers :- " + s);
        System.out.println("Stack After  Revers :- " +Rev(s));

        reverse(s);
       
    }

    static Stack<Integer> Rev(Stack<Integer> s) {
        Stack<Integer> a= new Stack<>();
        while (!s.isEmpty()) {
            a.push(s.pop());
        }

        for(int j:a){
            System.out.println(j);
        }
        return a;
    }
    static void reverse(Stack<Integer> s)
    
    {
       Stack<Integer> a= new Stack<>();
       rev(s,a);
       
       while(!a.isEmpty())s.push(a.pop());
    }
    static void rev(Stack<Integer> s,Stack<Integer> a){
        if(s.isEmpty())return;
        
        int num=s.pop();
        rev(s,a);
        a.push(num);
    }
}
