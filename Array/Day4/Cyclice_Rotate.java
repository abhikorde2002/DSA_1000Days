package Array.Day4;

import java.util.Arrays;

public class Cyclice_Rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr, arr.length);
    }
    static void rotate(int arr[],int n){
         for (int i=0;i< arr.length-1;i++){
          int tem = arr[n-1];
          arr[n-1]=arr[i];
          arr[i]=tem;
           }

           for(int a:arr){
            System.out.println(a);
           }
    }
}
