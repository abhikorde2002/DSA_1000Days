package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Max_Sum_Combination {
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 3};
        int num[]={2, 5, 1, 6};
        System.out.println(Arrays.toString(combination_Sum(arr, num, 4)));
       
    }

    static int[] combination_Sum(int arr[],int num[],int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> a-b);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < num.length; j++) {
                int sum=arr[i]+num[j];
              
                pq.offer(sum);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        int sum[]=new int[k];
        int ind=k-1;
        while (!pq.isEmpty()) {
            sum[ind--]=pq.poll();
        }
        return sum;
    }
}
