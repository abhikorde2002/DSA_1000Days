package Heap.Min;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import Array.Day_22.Collection;

public class L_Trequence {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }
     public static int[]  topKFrequent(int[] arr, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        Integer[] my = new Integer[set.size()];
       
        set.toArray(my);
        PriorityQueue<Integer> str= new PriorityQueue<>();
        for(int i:my){
            System.out.println(str.offer(map.get(i)));
        }
        System.out.println(str);
       // Collections.sort(map,(a,b)-> );
        Set<Integer> s= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>=k){
                s.add(arr[i]);
            }
        }
        Integer[] array = new Integer[s.size()];
       int num[]= new int[s.size()];
       
        s.toArray(array);
       int ind=0;
    
        for (int i : array) {
            num[ind++]=i;
        }
        return num;
    }
}
