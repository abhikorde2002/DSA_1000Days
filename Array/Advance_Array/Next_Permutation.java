package Array.Advance_Array;

import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        int arr[]={2,3,1};
        nextPermutation(arr);
    }

     public static void nextPermutation(int[] arr) {
        int id=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                id=i;
                break;
            }
        }
        if(id==-1){
            Arrays.sort(arr,0,n);
            return;
        }
        for(int i=n-1;i>=0;i--){
             if(arr[i]>arr[id]){
                int tem= arr[i];
                arr[i]= arr[id];
                arr[id]= tem;
                break;
             }
        }
        Arrays.sort(arr,id+1,n);
        System.out.println(Arrays.toString(arr));
     }}