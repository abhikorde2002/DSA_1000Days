package Array.Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Target_Indices {
    public static void main(String[] args) {
        int arr[]={1,2,5,2,3};
        System.out.println(search(arr, 2));
    }

     public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> st= new ArrayList<>();
         Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                st.add(i);
            }
        }
        return st;
    }

    static List<Integer>  search(int arr[],int target){
         Set<Integer> st = new HashSet<>();
         Arrays.sort(arr);
         st.add(bineary(arr, target, true));
         st.add(bineary(arr, target, false));
         List<Integer> sh=new ArrayList<>();
         for(int i:st){
         sh.add(i);
         }
        return sh;
    }

    static int bineary(int arr[],int target,boolean firstoccurance){
        int start=0;
        int end=arr.length;
        int ans=0;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]< target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstoccurance){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
