package Heap.Max;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/*
 You gotta find 2 most frequent elements in list. 
 It does not mean to return elements with occurrence/frequency of 2 or more. 
 So if you count occurrence of each element, then sort it by highest to lowest occurrence, your answer will be 
 top 2 elements in that list.
  In this case both element [1,2] have occurred once and we need to return top 2 elements with 
  highest occurrence so answer is [1,2]. If that makes sense!
 */
public class Top_K_Freq {
    public static void main(String[] args) {
       int arr[]={3, 1, 4, 4, 5, 2, 6, 1};
       System.out.println(Arrays.toString(topKFrequents(arr, 2)));
    }
    public static int[] topKFrequents(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue (min-heap) to keep track of the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Step 3: Maintain the size of the heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Extract the results from the heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }

        return result;
    }
}