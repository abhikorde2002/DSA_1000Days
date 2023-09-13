package Array.Day_3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={20,10,1,4,30};
        bubblesort(arr);
    }

    static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
              if(arr[j]>arr[j+1]){
                int tem=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tem;
              }
            }
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
    
}
