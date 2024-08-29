package Complete_Heap.MAX_Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Merge_Sorted {
    public static void main(String[] args) {
       int  arr[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
       System.out.println(mergeKArrays(arr, 3)); 
    }

    static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        PriorityQueue<Integer>  s= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int ind[]=arr[i];
            int j=0;
            while (j!=ind.length) {
                s.offer(ind[j++]);
            }
        }
       System.out.println(s);
        ArrayList<Integer> str= new ArrayList<>();
      while (!s.isEmpty()) {
         str.add(s.poll());
      }
        return str;
        
    } 
}
