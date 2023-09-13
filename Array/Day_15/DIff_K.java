package Array.Day_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DIff_K {
    public static void main(String[] args) {
        int arr[]={1, 5, 2, 2, 2, 5, 5, 4};
        result(arr, 3);
    }
    static void result(int arr[],int k){
       int i=0;
        Arrays.sort(arr);
       Set<Integer> sh= new HashSet<>();
       for(int a:arr){
           sh.add(a);
       }
       for(int j:sh){
        if(j-k>=0){
            System.out.println(j+", "+(j-k));
        }
        j++;
       }
      
    //    System.out.println(Arrays.toString(arr));
    //    while(i<arr.length-1){
    //     if(arr[i]!=arr[i+1]){
    //        if(arr[i]-k>=0){
    //         System.out.println(arr[i]+", "+(arr[i]-k));
    //     }
    // }
    //     i++;
    //    }
    }
}
