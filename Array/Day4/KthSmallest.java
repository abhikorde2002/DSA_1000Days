package Array.Day4;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60};
        kthsmallest(num, 4);
    }

    static void kthsmallest(int num[],int k){
        PriorityQueue<Integer> pQueue= new PriorityQueue<>(Collections.reverseOrder()); 

        for(int i=0;i<k;i++){
            pQueue.add(num[i]);
        }

        for(int i=k;i<num.length;i++){
              if(pQueue.peek() > num[i]){
                pQueue.poll();
                pQueue.add(num[i]);
              }
        }
        System.out.println(pQueue.peek());
    }
}
