package Sliding_Two_Pointer.Revegen;

import java.util.HashMap;
import java.util.Map;

public class MAX_Con_One {
    public static void main(String[] args) {
        int arr[]= {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(max_Con(arr, 2));
     //   System.out.println( max_consecutive(arr, 2));
    }
   
    static int max_Con(int arr[],int k){
        int zero=0;
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        while (right<arr.length) {
            if (arr[right]==0) {
                zero++;
            }
            if (zero>k) {
                if (arr[left]==0) {
                    zero--;
                }
                left++;
            }
            
                max=Math.max(max, right-left+1);
                right++;
            
            
        }
        return max!=Integer.MIN_VALUE ? max:0;
    }
    static int max_consecutive(int arr[],int k){
        Map<Integer,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while (right<arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
            if( map.get(0)>k){
                while (map.get(0)>k) {
                    map.put(arr[left],map.get(arr[left++])-1);
                }
            }
        
           max= Math.max(max, right-left+1);
           right++;
        }
        return max;
    }
}
