package Array.Day5;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr[]={ 1, 5, 9, 10, 15, 20 };
        int num[]={ 2, 3, 8, 13 };
        merge(arr,num);
    }

    static void merge(int arr[],int num[]){
        int i=0,j=0;
        int k=arr.length-1;
        while(i<=k && j<=num.length){
         if(arr[i] <num[j] ){
            i++;
         }
         else {
            int tem= num[j];
            num[j] = arr[k];
            arr[k] = tem;
            j++;
            k--;
         }
        }
        Arrays.sort(arr);
        Arrays.sort(num);
         System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(num));
    }
}
