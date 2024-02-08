package Array.Day_19;

import java.util.HashSet;
import java.util.Set;

public class MINIMUM_SUB {
    public static void main(String[] args) {
        int arr[]={1,4,4};
        System.out.println(minSubArrayLen(5, arr));
        System.out.println(Sub_array(arr, 5));
    }

     public static int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int start=0;
        int end=nums.length-1;
        Set<Integer> str= new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(nums[start]==target ){
               str.add(nums[start]);
        }
        if(nums[end]==target){
            str.add(nums[end]);
        }
        if(nums[start]+nums[end]==target){
            str.add(nums[start]);
            str.add(nums[end]);
        }
        else if(nums[start]+nums[end]> target){
            end--;
        }
        else{
            start++;
        }
    }
        return str.size();
}

     static int Sub_array(int arr[],int target){
        int ans=Integer.MAX_VALUE;
        int curr=0;
        int start=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            while(curr>=target){
                ans=Math.min(ans,i-start+1);
                curr -=arr[start++];    
            }
        }
        
      return ans!=Integer.MAX_VALUE?ans:0;
     }
}
 