package Heap.Max;

import java.util.PriorityQueue;

public class Sum_Element {
    public static void main(String[] args) {
        int arr[]={10, 2, 50, 12, 48, 13};
        System.out.println(sum_ele(arr, 2, 6));
    }
    static int sum_ele(int arr[],int k,int k1){
       PriorityQueue<Integer> map= new PriorityQueue<>();
       for (int i = 0; i < arr.length; i++) {
         map.offer(arr[i]);
       }
       int cou=0;
       int sum=0;
      while (!map.isEmpty()) {
        int val=map.poll();
        cou++; 
        if(cou>k && cou<k1){
            sum+=val;
         }
      }
    return sum;
    
    }
}
