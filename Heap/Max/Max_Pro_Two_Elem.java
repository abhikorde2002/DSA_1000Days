package Heap.Max;

import java.util.PriorityQueue;

public class Max_Pro_Two_Elem {
    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] arr) {
        PriorityQueue<Integer> map= new PriorityQueue<>((a,b)-> b-a);
       for(int i=0;i<arr.length;i++){
           map.offer(arr[i]);
       }
       int left=map.poll();
       int rig=map.poll();
       return ((left-1)*(rig-1));
   }
}
