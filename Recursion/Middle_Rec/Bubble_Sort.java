package Recursion.Middle_Rec;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        search(arr,arr.length-1 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] search(int arr[],int n,int c){
        if(n==0){
            return arr;
        }
       if(c<n){
        if(arr[c]>arr[c+1]){
            int tem=arr[c];
             arr[c]=arr[c+1];
            arr[c+1]=tem;
        }
        return search(arr,n, c+1);
       }
       else{
       return search(arr,n-1, 0);
       }
    }
    
}
