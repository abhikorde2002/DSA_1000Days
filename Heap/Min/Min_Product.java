package Heap.Min;

import java.util.PriorityQueue;

//Given an array of n positive integers. We are required to write a program to print 
//the minimum product of k integers of the given array.
public class Min_Product {
    public static void main(String[] args) {
        int arr[]={11, 8 ,5, 7, 5, 100};
           System.out.println(min_Product_K(arr, 4));
    }

    public static int min_Product_K(int arr[],int k){
       PriorityQueue<Integer>  map= new PriorityQueue<Integer>();
       for (int i = 0; i < arr.length; i++) {
            map.offer(arr[i]);
       }
       int ans=1;
       while (k--!=0) {
         ans*=map.poll();
       }
   
       return ans;
       
    }

}
