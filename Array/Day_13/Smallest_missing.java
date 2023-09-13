package Array.Day_13;

import java.util.Arrays;

public class Smallest_missing {
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 6, 3, 7, 8};
        Arrays.sort(arr);
        System.out.println(smallest(arr, 0, arr.length-1));
    }

    static int smallest(int arr[],int start,int end){
         
             if (start> end){
              return start;
            }
         
            int mid=start + (end - start) /2  ;
            if(arr[mid]== mid){
                return smallest(arr, mid+1, end);
            } 
            else {
                return smallest(arr, start, mid-1);
            }
        }
}
