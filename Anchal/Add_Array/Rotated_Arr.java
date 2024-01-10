package Anchal.Add_Array;

import java.util.Arrays;

public class Rotated_Arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int ind=0;
        int k=3;
        for(int i=0;i<k;i++){
            rotates(arr, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     arr[ind++]=arr[i];
        // }
        // System.out.println(Arrays.toString(arr));
    }

    static int[] rotates(int arr[],int n){
        for (int i=0;i< arr.length-1;i++){
         int tem = arr[n-1];
         arr[n-1]=arr[i];
         arr[i]=tem;
        }   
          return arr;
   }
}
