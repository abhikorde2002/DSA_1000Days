package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Last_Stone_weight {
    public static void main(String[] args) {
        int arr[]={8,7,4,2,1,1};
        System.out.println(Sone_Weight(arr));
    }

    static int Sone_Weight(int arr[]){
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> b-a);
        if (arr.length==1) {
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        while (!pq.isEmpty()) {
            int y=pq.poll();
            int x=0;
            if (!pq.isEmpty()) {
                 x=pq.poll();
            }
            else{
                return y;
            }
            if (x==y) {
                continue;
            }
            else{
                pq.offer(Math.abs(y-x));
            }
        }
        return 0;
    }
}
