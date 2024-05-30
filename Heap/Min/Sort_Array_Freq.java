package Heap.Min;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Given an array of integers nums, sort the array in increasing order based on the frequency of the values. 
//If multiple values have the same frequency, sort them in decreasing order.


public class Sort_Array_Freq {
    public static void main(String[] args) {
        int arr[]={-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(topKFrequents(arr, 0)));
    }
     public static int[] topKFrequents(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
       System.out.println(frequencyMap);
        // Step 2: Use a PriorityQueue (min-heap) to keep track of the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Step 3: Maintain the size of the heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);        
        }

        // Step 4: Extract the results from the heap
        int[] result = new int[nums.length];
        int index = 0;
        while (!minHeap.isEmpty()) {
            int val= minHeap.poll().getKey();
            while (frequencyMap.containsKey(val)) {
                frequencyMap.put(val, frequencyMap.get(val) - 1);
                result[index++]=val;
                if (frequencyMap.get(val) == 0) {
                    frequencyMap.remove(val);
                }
            }
        }
        
        return result;
    }

}
