package Array.Add_Array;

import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        sum=nums[0];
        arr[0]=sum;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
