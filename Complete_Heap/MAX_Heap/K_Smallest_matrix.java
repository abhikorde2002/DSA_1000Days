package Complete_Heap.MAX_Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Smallest_matrix {
    public static void main(String[] args) {
     //   int arr[][]={{1,5,9},{10,11,13},{12,13,15}};
     // int arr[][]={{-5}};
     int arr[][]={{1,2},{1,3}};
        System.out.println(kthSmallest(arr, 2));
    }

    public static int kthSmallest(int[][] arr, int k) {
    
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> b-a);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(pq.size()<k){
                pq.offer(arr[i][j]);
                }
                else{
                    if(arr[i][j]<pq.peek()){
                        pq.poll();
                        pq.add(arr[i][i]);
                    }
                }
                // if (pq.size()>k) {
                //     pq.poll();
                // }
            }
        }
        System.out.println(pq);
        // while (k-->1) {
        //     pq.poll();
        // }
        
    int val= pq.poll();

      
        return val;
    }
}
