package Greed;

import java.util.Arrays;

public class Max_Sum_K {
    public static void main(String[] args) {
        int arr[]={2,10,9,9,8,5,6,4,7,6,3,9,4,2,10,5,9,7,7,3,10,9,7,4,3,1,1,1,1,1,7,1,2,6,6,6,8,7};
        System.out.println(maximizeSum(arr, 1));
    }

    public static int maximizeSum(int[] arr, int k) {
      //  Arrays.sort(arr);
        // int sum=arr[arr.length-1];
        // int ans=arr[arr.length-1];;
        // if(k==1 && arr.length>0)return arr[arr.length-1];
        // while(k!=1){
        //     sum+=ans+1;
        //     k--;
        //     ans+=1;
        // }
        // return sum;
        int max=0;
     for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
     }
        int sum=max;
        int ans=max;
        if(k==1 && arr.length>0)return max;
        while(k!=1){
            sum+=ans+1;
            k--;
            ans+=1;
        }
        return sum;
    }
}
