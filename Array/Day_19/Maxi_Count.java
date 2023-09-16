package Array.Day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Maxi_Count {
    public static void main(String[] args) {
        int arr[]={-2,-2,-1};
        
        int start=bineary(arr, true);
        int end=bineary(arr, false);
        int sum=end-start+1;
        int tar=arr.length -sum;
         int i=0;
        while(i<arr.length && arr[i] == 0){
             tar--;
            i++;
            System.out.println(i);
        }
        tar=tar-i;
        System.out.println(tar);
        System.out.println(maximumCount(arr));
     // System.out.println(bineary(arr, false));;
         
        
        
    }
    static int bineary(int arr[],boolean first){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
      
        while(start<=end){
            if(arr[0]>0 || arr[arr.length-1]<0){

            }
            int mid=start + (end-start)/2;
            if(arr[mid]>0){
                ans=mid;
                if(first){
                  end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                start=mid+1;
            }
        }
       
        return ans;
    }
    public static int maximumCount(int[] nums) {
        if(nums[0]>0 || nums[nums.length-1]<0){
            return nums.length;
        }
        int start=0;
        int end=nums.length-1;
      while(start<end){
        int mid = start + (end - start)/2;
        if(nums[mid]<0){
            start = mid + 1; 
        }
        else{
            end = mid ;
        }
    }
    int pos = nums.length - start;
    int i = start;
    while(i<nums.length && nums[i] == 0){
        pos -- ;
        i++;
    }
    
  
    return start > pos? start : pos;
    }    
}
