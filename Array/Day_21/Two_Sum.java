package Array.Day_21;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(twoSum(arr, 9));
    }
    public static int[] twoSum(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
             if(arr[start]+arr[end]==target){
                 return new int[]{arr[start],arr[end]};
             }
             else if(arr[start]+arr[end]>target){
                end--;
             }
             else{
                start++;
             }
        }
        return new int[0];
    }
    
}
