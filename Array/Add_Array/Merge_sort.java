package Array.Add_Array;

import java.util.Arrays;

public class Merge_sort {

    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0} ;
        int num[]={2,5,6};
        merge(arr, 3, num, 3);
    }
    public static void merge(int[] arr, int m, int[] num, int n) {
        int a[]=new int[arr.length];
        // for(int i=0,j=0;i<n && j<m;i++){
        //       if(arr[i]<num[j]){
        //           a[j]=arr[i];
        //       }  else{
        //     arr[i]=num[j];
        //     j++;
        //   }
   // }
        
    System.out.println(Arrays.toString(arr));
        
    }
}
