package Heap.Min;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue <Integer> map= new PriorityQueue<Integer>();
 private int k;
    public KthLargest(int k, int[] arr) {
       this.k=k;
       for(int n : arr) add(n);
    }
    
    public int add(int val) {
       map.offer(val);
       if(map.size()>k)map.poll();
       return map.peek(); 
    }
}
