package Array.Day_10;

import java.util.Arrays;
import java.util.HashSet;

public class Celling {
    public static void main(String[] args) {
         int arr[]={1,2,4,7,9,11,14,15,20,30};
         System.out.println(celling(arr, 16));
        
       
    }
    static int celling(int arr[],int target){
        int start =0 ;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else end = mid-1;

        }
        return start;
    }
  

}

