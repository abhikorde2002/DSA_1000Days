package Complete_Heap.MIN_Heap;

import java.util.PriorityQueue;

public class Hands {
    public static void main(String[] args) {
        int arr[]={2,1};
        System.out.println(isNStraightHand(arr, 2));
    }

     public static boolean isNStraightHand(int[] arr, int groupSize) {
        PriorityQueue<Integer> map= new PriorityQueue<>();
        for(int num:arr){
            map.offer(num);
        }

        int cou=0;
        int target=0;
        while(!map.isEmpty()){
             cou++;
             map.poll();
             if(cou==groupSize){
                target++;
                cou=0;
             }
        }
        if(target==groupSize){
            return true;
        }

        return false;
    }
}
