package Complete_Heap.MIN_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Min_Number {
    public static void main(String[] args) {
        int arr[]={5,4,2,3};
        System.out.println(Arrays.toString(numberGame(arr)));
    }

    public static int[] numberGame(int[] nums) {
        PriorityQueue<Integer> map= new PriorityQueue<>();
        int arr[]= new int[nums.length];
        if (nums.length==1) {
            arr[0]=nums[0];
            return arr;
        }
        for (int i = 0; i < nums.length; i++) {
            map.offer(nums[i]);
        }
        int ind=0;
        while (!map.isEmpty()) {
          int val=map.poll();
          int a=map.poll();
          arr[ind++]=a;
          arr[ind++]=val;
        }

        return arr;
    }
}
