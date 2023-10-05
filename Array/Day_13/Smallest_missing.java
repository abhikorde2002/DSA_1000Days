package Array.Day_13;

import java.util.Arrays;

public class Smallest_missing {
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 6, 3, 7, 8};
        Arrays.sort(arr);
        System.out.println(smallest(arr));
    }

    static int smallest(int arr[]){
            int start=0;
            int end=arr.length-1;
            while(start<end){        
            int mid=start + (end - start) /2  ;
            if(arr[mid]== mid){
                start=mid+1;
            } 
            else {
               end=mid-1;
            }
        }
        return start;
    }
}
