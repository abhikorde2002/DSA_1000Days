package Complete_Heap.MAX_Heap;

import java.util.PriorityQueue;

public class K_TH_Smallest {
    public static void main(String[] args) {
        int arr[]={7, 10 ,4 ,3 ,20 ,15};
        System.out.println(kthSmallest(arr, 0, arr.length-1, 4));
    }

      public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> s= new PriorityQueue<>((a,b) -> b-a);
        for(int i=l;i<=r;i++){
            s.offer(arr[i]);
            if(s.size()>k){
                s.poll();
            }
        }
        return s.peek();
    } 
}
