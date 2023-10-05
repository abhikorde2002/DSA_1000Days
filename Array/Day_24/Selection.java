package Array.Day_24;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2};
        System.out.println(Arrays.toString(Sort(arr)));
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
}
