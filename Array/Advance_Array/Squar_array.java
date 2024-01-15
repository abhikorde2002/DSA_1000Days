package Array.Advance_Array;

import java.util.Arrays;

public class Squar_array {
    public static void main(String[] args) {
        int arr[]={-5, -4, -2, 0, 1};
        System.out.println(Arrays.toString(myArray(arr)));
    }

    static int[] myArray(int arr[]){
        int num[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]= arr[i] *arr[i];
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
       return num;
    }
}
