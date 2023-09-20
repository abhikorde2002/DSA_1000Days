package Array.Day_10;

import java.util.Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
       Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=nums[i+1]){
           return nums[i+1];}
           i++;
        }
       return nums[nums.length-1];
    }
}
