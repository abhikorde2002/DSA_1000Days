package Heap.Min;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Lar {
    PriorityQueue <Character> map= new PriorityQueue<Character>();
    public static void main(String[] args) {
        int arr[]={11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        System.out.println(kth_largest(arr, 3));
        System.out.println(Arrays.toString(arr));
    //    System.out.println(Arrays.toString(simple(arr)));
    //    String s="ABCDEF";
    //    System.out.println(KTh_Largest(s, 3));
    }

    static Character KTh_Largest(String s,int k){
        PriorityQueue <Character> map= new PriorityQueue<Character>();
        for (int i = 0; i < s.length(); i++) {
            map.offer(s.charAt(i));
            if(map.size()>k){
                map.poll();
            }
        }
        while(!map.isEmpty()) {
            System.out.println(map.poll());
        }
        return map.peek();
    }
    static int kth_largest(int arr[],int k){
        PriorityQueue <Integer> map= new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.add(arr[i]);
            if(map.size()>k){
                map.poll();
            }

        }
        // while (!map.isEmpty()) {
           
        //     map.poll();
        //      System.out.println();
        // }
        return map.peek();
    }
    static int[] kth_largest_Array(int arr[],int k){
        PriorityQueue <Integer> map= new PriorityQueue<Integer>();
        int num[]=new int[arr.length];
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            map.add(arr[i]);
            if(map.size()>k){
                num[ind++]=  map.poll();
            
            }

        }
        while (!map.isEmpty()) {
           
            num[ind++]=  map.poll();
          
        }
       
        return num;
    }
}
