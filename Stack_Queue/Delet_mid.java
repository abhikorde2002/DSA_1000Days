package Stack_Queue;

import java.util.Stack;

public class Delet_mid {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        deleteMid(s, 5);
    }

    public static void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> st= new Stack<>();
        int mid= (0 + sizeOfStack)/2;
      
        int i=0;
        while(!s.isEmpty()){
            if(i!=mid){
               st.push(s.pop());
               System.out.println(st); 
            }
           else{ s.pop();}
            i++;
        }
        
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        System.out.println(s);
    } 
}
