package Heap.Max;

import java.util.Arrays;

public class Largest_Number {
    public static void main(String[] args) {
        int a=1231;
        System.out.println(largestInteger(a));
    }
    // static int Swap(int a){
    //     int arr[]=largestInteger(a);
    //     while (arr.length) {
            
    //     }
    // }
    public static int[] largestInteger(int number) {
        int reverse=0;
       // int arr[]= new int[];
       int num=number;
        int size=0;
        while(number>0){
            int digits=number%10;
          size++;
            number=number/10;
        }
     int arr[]= new int[size];
     int n=arr.length-1;
        while(num>0){
            int digits=num%10;
            arr[n--]=digits;
            reverse=reverse*10+digits;
            num=num/10;
        }
        System.out.println(Arrays.toString(arr));
     return arr;
    }
}
