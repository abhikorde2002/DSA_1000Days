package Array.Advance_Array;

import java.util.Arrays;

public class Rearange_Array {
    public static void main(String[] args) {
        int num[]={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(num)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length/2];
        int str[]=new int[nums.length/2];
        int i=0;
        int s=0;
        int b=0;
        while(i<nums.length){
            if(nums[i]<0){
                str[s++]=nums[i];
            }
            else{
                arr[b++]=nums[i];
            }
            i++;
        }   
        System.out.println(Arrays.toString(arr));
        int start=0;
        int end=0;
        for(int a=0;a<nums.length;a++){
            nums[a]=arr[start++];
            nums[a+1]=str[end++];
            a++;
            System.out.println(a);
        }
        return nums;
       }
       public int[] rearrangeArrays(int[] nums) {
        int pos=0,neg=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
      }
}
