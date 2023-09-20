package Array.Day_21;

import java.util.Arrays;

public class Serach_rotated {
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        System.out.println(rotated(arr, 0));
    }

    static boolean rotated(int arr[],int tar){
        Arrays.sort(arr);
        int stat=0;
        int end=arr.length-1;
        while(stat<=end){
            int mid=stat + (end-stat)/2;
            if(arr[mid]==tar){
                return true;
            }
            else if(arr[mid]>tar){
                end=mid-1;
            }
            else{
                stat =mid+1;
            }
        }
        return false;
    }
}
