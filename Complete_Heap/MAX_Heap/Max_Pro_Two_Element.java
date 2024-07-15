package Complete_Heap.MAX_Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Max_Pro_Two_Element {
    public static void main(String[] args) {
       int arr[]={3,4,5,2};
       System.out.println(maxProduct(arr));
       
    }

    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> s= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            s.offer(nums[i]);
            if(s.size()>2){
                s.poll();
            }
        }
        // int a=s.poll();
        // int b=s.poll();
        int ans=Math.abs((s.poll()-1)*(s.poll()-1));
        
        return ans;
    }


}
