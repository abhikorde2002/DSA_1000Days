package Array.Basic_Array;

import java.util.ArrayList;
import java.util.Collections;

public class All_Divisible {
    
    public static void main(String[] args) {
        print_divisors(2);
    }

     public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> s= new ArrayList<>();
        // if(n==2)return 1;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
               s.add(i);
               if(n/i !=i){
                   s.add(n/i);
               
            }
        }}
        Collections.sort(s);
        for(int a:s){
             System.out.print(a+" ");
        }
      //  System.out.print(n);
    }
}
