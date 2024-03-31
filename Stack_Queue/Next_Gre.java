package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Next_Gre {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,3};
        System.out.println(Arrays.toString(nextLargerElement(arr,arr.length)));

    }
   //If we us this approch it will get error time limit
    static long[] Gre(long arr[]){
        long a[]= new long[arr.length];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    a[i]=arr[j];
                    ans++;
                    break;
                }
            }
            if(ans==0){
                a[i]=-1;
            }
            ans=0;
        }
        return a;
    }
     public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
         long a[]= new long[arr.length];
        int ans=0;
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            a[i]=s.isEmpty() ?-1: arr[s.peek()];
            s.push(i);
        }
        int b=0;
        while (b<arr.length) {
            if(arr[arr.length-1]<arr[b]){
                a[arr.length-1]=arr[b];
                break;
            }
            b++;
        }
        return a;
    } 
}
