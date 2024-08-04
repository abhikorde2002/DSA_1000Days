package Complete_Heap.MIN_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Small_Prime {
    public static void main(String[] args) {
        int arr[]= {1,7};
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 1)));
    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                pq.offer(arr[i]);
                if(pq.size()>k){
                   pq.poll();
                }
            }
        }
        int num[]= new int[pq.size()];
        int ind=0;
        while (!pq.isEmpty()) {
            num[ind++]=pq.poll();
        }
        return num;
    }

    public static boolean isPrime(int arr){
        boolean prime=false;
        if(arr==1 || arr==0)return prime;
        for(int i=2;i<=arr/2;i++){
         if(arr%i==0){
            return prime;
         }
        }
        return true;
    }
}
