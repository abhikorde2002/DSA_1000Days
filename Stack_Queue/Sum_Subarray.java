package Stack_Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Sum_Subarray {
    public static void main(String[] args) {
       int arr[]={3,1,2,4};
       System.out.println(sumSubarrayMins(arr));
    }
 //3, 2, 1, 1, 2, 1, 1, 1, 1, 4
 //3, 1, 2, 4, 1, 1, 2, 1, 1, 1
    public static void sumSubarray(int[] arr) {
        

        long ans=0;
        for(int i=0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                long min=Long.MAX_VALUE;
                for (int j2 = i; j2 <= j; j2++) {
                 
                    min=Long.min(min, arr[j2]);
                  
                }
                ans+=min;
             
            }
           
        }
        System.out.println(ans);

     
    }
      public static int sumSubarrayMins(int[] arr) {
        int len=arr.length;
        int left[]=new int[len];
        int rig[]= new int[len];

        Arrays.fill(left,-1);
        Arrays.fill(rig,len);

        Deque<Integer> s= new ArrayDeque<>();

        for(int i=0;i<len;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                System.out.println(s.pop());
                
            }
            if(!s.isEmpty()){
                left[i]=s.peek();
                System.out.println(left[i]);
            }
            s.push(i);
        }

        s.clear();

         for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]> arr[i]){
                System.out.println(s.pop());
            }
            if(!s.isEmpty()){
                rig[i]=s.peek();
                System.out.println(rig[i]);
            }
            s.push(i);
        }

        int mod= (int)1e9 +7;
        long ans=0;

        for(int i=0;i<len;i++){
            ans+=(long) (i-left[i])* (rig[i]-i) % mod*arr[i]%mod;
            System.out.println(ans);
            ans%=mod;
            System.out.println(ans);
        }
        return (int)ans;    }
}
