package Heap.Min;

import java.util.HashSet;
import java.util.Set;

public class Make_Arr_Zero {
   public static void main(String[] args) {
    int arr[]= {1,5,0,3,5};
    System.out.println(minimumOperations(arr));
   }
   
   static  int minimumOperations(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i:nums){
            if(i!=0){
                s.add(i);
            }
        }
        for (Integer integer : s) {
            System.out.println(integer);
        }
        return s.size();
    }
}
