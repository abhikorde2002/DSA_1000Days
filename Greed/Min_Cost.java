package Greed;

import java.util.Arrays;



public class Min_Cost {
    public static void main(String[] args) {
        int arr[]={3,3,3,1};
        System.out.println(minimumCost(arr));
    }

    static int minimumCost(int[] arr) {
        if (arr.length==1) {
            return arr[0];
        }
        Arrays.sort(arr);
       int ans=0;
    
        for (int i = arr.length-1; i >=0 ; i--) {
            if(i>0){
               ans+=arr[i]+arr[i-1];
               System.out.println(ans);
               i-=2;
            }
            else if(i==0){
                ans+=arr[i];
            }
       
        }
        return ans;
    } 
}
