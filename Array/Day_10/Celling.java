package Array.Day_10;

import java.util.Arrays;
import java.util.HashSet;

public class Celling {
    public static void main(String[] args) {
         int arr[]={1,2,4,7,9,11,14,15,20,30};
        //  System.out.println(celling(arr, 16));
        // int num[]={1,2,3,2,5};
        // System.out.println(missingInteger(num));
        System.out.println(celling(arr, 31));
       
    }
    public static int missingInteger(int[] arr) {
        int a = 0;
    int sum = 0;

    for (int i = 0; i <arr.length-1 ; i++) {
        if (arr[i] < arr[i + 1]) {
            sum += arr[i];
        }
        
        System.out.println(arr[i]);
        if (arr[i] > arr[i + 1] && sum <= arr[i + 1]) {
            i += 1;
            while (i <= arr.length - 1) {
                if (arr[i] > sum && a < arr[i]) {
                    a = arr[i];
                }
                i++;
            }
        }
    }
 System.out.println(a+" "+sum);
    return a > sum ? a : sum;
       
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

