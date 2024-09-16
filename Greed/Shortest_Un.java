package Greed;

public class Shortest_Un {
    public static void main(String[] args) {
        int arr[]={1,3,2,2,2};
        System.out.println(findUnsortedSubarray(arr));
    }

    public  static int findUnsortedSubarray(int[] nums) {
       int end=0;
       int max=nums[0];
       for (int i = 1; i < nums.length; i++) {
         if(nums[i]<max) end=i;
         else max=nums[i];
       }

       int start=0;
       int min=nums[nums.length-1];
       for (int i = nums.length-2; i >=0; i--) {
            if (nums[i]>min) {
                start=i;
            }
            else{
                min=nums[i];
            }
       }
       return (end-start)+1;
    }
}
