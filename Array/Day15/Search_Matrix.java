package Array.Day15;

import java.util.Arrays;

public class Search_Matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16 }};
        System.out.println(Arrays.toString(search(arr, 8)));
        //System.out.println(search(arr, 8));
    }
    static int[] search(int arr[][],int tar){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
        int mid=start + (end-start)/2;

        if(arr[start][end]==tar){
            return new int[]{start,end};
        }
        if(arr[start][end]>tar){
            end--;
        }
        else{     
            start++;
        }
       }
       return new int[]{-1,-1};
    }
}
