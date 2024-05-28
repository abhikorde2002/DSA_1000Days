package Heap.Max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import Array.Day_22.Collection;

public class kth_Smallest {
    public static void main(String[] args) {
       int arr[]={2,3,4,5};
       
    //   System.out.println(kth_Smallest_Elemet(arr, 4)); 
       System.out.println(kth_Smallest_Elemet(arr, 4));
    }

    static int kth_Smallest_Elemet(int arr[],int k){
        PriorityQueue<Integer> max= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            max.offer(arr[i]);
            if (max.size()>k) {
                max.poll();
            }

        }
        int val=max.peek();
        while (!max.isEmpty()) {
            System.out.println(max.poll());
        }
      
        return val;
    }
    static ArrayList<Integer> Sorting(int arr[][],int k){
        ArrayList<Integer> str= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                str.add(arr[i][j]);
            }
        }
        Collections.sort(str);
    return str;
    }

}

