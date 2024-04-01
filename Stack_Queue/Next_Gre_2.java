package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Next_Gre_2 {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }

      public static int[] nextGreaterElements(int[] arr) {
         int a[]= new int[arr.length];
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
         Arrays.fill(a,-1);
        for(int i=n*2-1;i>=0;i--){
            while(!s.isEmpty() && arr[i%n]>=s.peek()){
               System.out.println(s.pop());
            }
            if(i<n){
            a[i]=s.isEmpty() ?-1: s.peek();
            System.out.println(a[i]);
            }
            System.out.println(s.push(arr[i%n]));
        }
        return a;
    }
}
