package Recursion.Middle_Rec;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        search(arr, 4, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          int min=i; 
         for(int j=i+1;j<arr.length;j++){
             if(arr[min]>arr[j]){
                 min=j;
             }
         }
         int tem = arr[min];
             arr[min] = arr[i];
             arr[i] = tem;
        }
       return arr;
     }

     static void search(int arr[],int n,int c,int max){
        if(n==0){
            return;
        }
       if(c<n){
       if(arr[c]>arr[max]){
        search(arr,n, c+1,c);
       }
       else{
        search(arr, n, c+1,max);
       }
    }
       else{
          int tem= arr[max];
          arr[max]= arr[n-1];
          arr[n-1]=tem;

       search(arr, n-1, 0, 0);
       }
    }
}
