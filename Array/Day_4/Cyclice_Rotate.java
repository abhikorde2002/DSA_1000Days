package Array.Day_4;

import java.util.Arrays;

public class Cyclice_Rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        
        int k=3;
        for(int i=0;i<k;i++){
    //    if(i!=k-1){ rotate(arr, arr.length);}
    //     if(i==k-1){
    //        System.out.println(Arrays.toString(rotates(arr, arr.length)));
    //     }
    rotates(arr, arr.length);
        }
        int ind=0;
        // for(int a:arr){
        //   arr[ind]
        // }
        for(int i=0;i<arr.length;i++){
            
        }
      //  System.out.println(Arrays.toString(rotates(arr, arr.length)));
    }
    static void rotate(int arr[],int n){
         for (int i=0;i< arr.length-1;i++){
          int tem = arr[n-1];
          arr[n-1]=arr[i];
          arr[i]=tem;
           }

           for(int a:arr){
            System.out.print(a+" ");
           }
           System.out.println();
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
