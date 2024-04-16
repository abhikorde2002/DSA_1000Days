package Sliding_Two_Pointer;

public class Bineary_Subsum {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,0,0,1,0,0,0};
        System.out.println(MyAns(arr, 2));
    }

    public static int numSubarraysWithSum(int[] arr, int g) {
       
        return Ans(arr,g)-Ans(arr,g-1);
     }
     public static  int Ans(int arr[],int g){
        int cou=0,sum=0,left=0,right=0;
         if(g<0){
             return 0;
         }
         while(right<arr.length){
             sum+=arr[right];
             while(sum>g){
                 sum-=arr[left];
                 left++;
             }
             cou+= right-left+1;
             right++;
         }
         return cou;
     }
     public static int MyAns(int[] arr, int g) {
        int cou=0,sum=0,left=0,right=0,tem=0;
         while(right<arr.length){
             sum+=arr[right];
             if(arr[right]==1)tem=0;
             if(sum>g){
                 sum-=arr[left];
                 left++;
             }
             while(sum==g && left<=right){
                 tem+=1;
                 sum-=arr[left];
                 left++;
             }
             cou+=tem;
             right++;
         }
         return cou;
     } 
     
     
     /*
      * 
      nums[left:right] represent the sliding window.

The most hardest part is how to deal with case like nums = [0,0,0,0,0]. We need another int variable to help us hold the previous total number of valid subarray which sum equal to goal.

Why we increment temp by 1 each loop even total != goal?
That is because if nums[right] != 1, it must equal 0, the total is unchanged but we have one more possible valid subarray.
      */
}
