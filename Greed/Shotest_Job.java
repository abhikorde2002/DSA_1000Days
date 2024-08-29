package Greed;

import java.util.Arrays;

public class Shotest_Job {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(shotest(arr));
    }
    static int solve(int arr[] ) {
           Arrays.sort(arr);
            int prev=0;
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
               sum+=prev;
              
               prev+=arr[i];
            }
           
            return sum/arr.length;
      }

    static int shotest(int arr[]){
        Arrays.sort(arr);
        int prev=arr[0];
        if(arr.length==1){
            return 0;
        }
        int sum=0;
        int ind=0;
        int num[]=new int[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
           sum+=prev;
           num[ind++]=sum;
           prev=arr[i];
        }
      
        int val=0;
        for (int i = 0; i < num.length; i++) {
            val+=num[i];
        }
       
        return val/arr.length;
    }
}
