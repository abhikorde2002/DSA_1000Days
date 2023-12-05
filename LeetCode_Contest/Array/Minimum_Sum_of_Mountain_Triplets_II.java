package LeetCode_Contest.Array;

public class Minimum_Sum_of_Mountain_Triplets_II {
    public static void main(String[] args) {
        int arr[] ={8,6,1,5,3};
      //  System.out.println(minimumSum(arr));
        System.out.println(minimum(arr));
    }
    static  int minimumSum(int[] nums) {
        int sum=Integer.MAX_VALUE;
       int ans=0;
       for(int i=0;i<nums.length;i++){
            int j=i+1;
           int  k=nums.length-1;
           while(j<k){
              if(nums[i] < nums[j] && nums[j]>nums[k]){
                ans=nums[i]+nums[j]+nums[k];
                    sum=Math.min(sum,ans);
               }  
           }        
       }
       return sum!=Integer.MAX_VALUE ? sum : -1;
   }
   public static int minimum(int[] nums) {
    int sum=Integer.MAX_VALUE;
    int ans=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i] < nums[j] && nums[j]>nums[k]){
             ans=nums[i]+nums[j]+nums[k];
                 sum=Math.min(sum,ans);
            }}}
    }
    return sum!=Integer.MAX_VALUE ? sum : -1;
}
}
