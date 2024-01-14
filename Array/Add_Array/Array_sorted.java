package Array.Add_Array;

import java.util.Arrays;

public class Array_sorted {
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        int num[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]=arr[i];
        }
        int i=0;
        int mid= i + (arr.length -i)/2;
        while (i<arr.length-1) {
            if(arr[0]<arr[arr.length-1] && arr[0]<arr[mid] && arr[0]<arr[1]){
                System.out.println("Array is sorted");
                System.out.println(Arrays.toString(arr));
                break;
            }
            else{
                rotates(arr, arr.length);
                System.out.println(Arrays.toString(arr));
            }
            i++;
        }
    }

    static int[] rotates(int arr[],int n){
        for (int i=0;i< arr.length-1;i++){
         int tem = arr[n-1];
         arr[n-1]=arr[i];
         arr[i]=tem;
        }   
          return arr;
   }
   public static void merge(int[] arr, int m, int[] num, int n) {
        
    for(int i=0,j=0;i<arr.length && j<num.length;){
          if(arr[i]<num[j]){
              arr[i]=arr[i];
              i++;
          }
          else{
            arr[i]=num[j];
            j++;
          }
    }
    System.out.println(Arrays.toString(arr));
}
}
