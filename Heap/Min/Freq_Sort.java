package Heap.Min;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Freq_Sort {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,4};
        System.out.println(Arrays.toString(topKFrequents(arr, 0)));
     //  System.out.println(Arrays.toString(swap(arr)));

    }
    public static int[] swap(int arr[]){
        for (int i = 0; i <= arr.length/2; i++) {
            int tem=arr[i];
           arr[i]= arr[arr.length-1-i];
           arr[arr.length-1-i]=tem;
        }
        return arr;
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
        int[] result = new int[minHeap.size()];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        swap(result);
        return result;
    }
}
