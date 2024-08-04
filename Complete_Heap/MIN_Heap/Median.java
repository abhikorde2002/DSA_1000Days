package Complete_Heap.MIN_Heap;

import java.util.PriorityQueue;

public class Median {
   static PriorityQueue<Integer> pq= new PriorityQueue<>();
    public static void main(String[] args) {
     
    addNum(1);
  //  addNum(2);
  //  addNum(3);
    System.out.println(find_Median());
    }

    static void addNum(int num){
         pq.offer(num);
    }

    static double find_Median(){
          int num[]=new int[pq.size()];
          double sum=0;
          int time=0;
          while (!pq.isEmpty()) {
            int v=pq.poll();
            sum+=v;
         num[time++]=v;
        }
        sum=sum/time;

        for (int i = 0; i < num.length; i++) {
            pq.offer(num[i]);
        }

          return sum;

    }
}
