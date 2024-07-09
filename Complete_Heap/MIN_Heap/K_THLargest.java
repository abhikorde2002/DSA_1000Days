package Complete_Heap.MIN_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_THLargest {
    public static void main(String[] args) {
        int arr[]={2,12,7,10,90,15};
        System.out.println(findKthLargest(arr, 1));
       System.out.println(Arrays.toString(findKth(arr, arr.length)));
    }

     public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> s= new PriorityQueue<>((a,b) -> b-a);
       
       for(int i=0;i<arr.length;i++)s.add(arr[i]);
       int cou=k-1;
       while(cou!=0){
        s.poll();
        cou--;
       }

        return s.peek();
    }
    public static int[] findKth(int[] arr, int k) {
        PriorityQueue<Integer> s= new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<arr.length;i++){
            s.offer(arr[i]);
          
        }
        int num[]=new int[k];
        int i=0; 
        while (!s.isEmpty()) {
             num[i++]=s.poll();
        }
        return num;
    }
}
