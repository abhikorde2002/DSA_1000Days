package Sliding_Two_Pointer;

import java.util.Arrays;

public class Long_Subarray {
    public static void main(String[] args) {
       int arr[]={2,5,1,10,10};
      // System.out.println(smallestSubWithSum(arr, arr.length, 14)); 
       System.out.println(Long_Sum(arr, 14));
    }
    //This solution takes time O(N+N) and space O()
    public static int smallestSubWithSum(int a[], int n, int k) {
        int Cuu_sum=0;
        int start=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          Cuu_sum+=a[i];
          while(Cuu_sum>k){
           
           Cuu_sum-=a[start++];
           ans=Math.max(ans, i-start+1);
          }
        //  System.out.println(ans);
         // System.out.println(start);
        }
       // System.out.println(Arrays.toString(a));
        return ans!=Integer.MAX_VALUE?ans:0;
}
     public static int Long_Sum(int arr[],int k){
        int l=0,r=0,sum=0;
        int max=Integer.MIN_VALUE;

        while (r<arr.length) {
            sum+=arr[r];
            if(sum>k){
                sum-=arr[l++];
            }
            else if(sum<=k){
                max=Math.max(max, r-l+1);
                
            }
            r++;
        }
        return max;
     }
}
