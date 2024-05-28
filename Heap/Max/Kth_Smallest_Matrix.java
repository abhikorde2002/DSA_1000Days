package Heap.Max;

import java.util.PriorityQueue;

public class Kth_Smallest_Matrix {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15, 25, 35, 45},{24, 29, 37, 48},{32, 33, 39, 50}};        
        System.out.println(kth_Small(arr, 7));
    }


    static int kth_Small(int arr[][],int k){
         PriorityQueue<Integer> map= new PriorityQueue<>();
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                map.offer(arr[i][j]);
            }
         }
        int cou=0;
        System.out.println(map);
        while (!map.isEmpty()) {
            int val=map.poll();
            cou++;
               if (cou==k) {
                return val;
               }
        }
        return -1;
        }
}

