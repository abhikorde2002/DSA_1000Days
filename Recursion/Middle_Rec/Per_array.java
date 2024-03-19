package Recursion.Middle_Rec;

import java.util.ArrayList;
import java.util.List;

public class Per_array {
    public static void main(String[] args) {
        int arr[]={1,2,3};
       System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // Initialize the result list
        backtrack(nums, 0, result); // Call the backtrack function to generate permutations
        return result; // Return the generated permutations
    }

    // Backtracking function to generate permutations
    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) { // Check if the current index is at the last position
            List<Integer> permutation = new ArrayList<>(); // Create a new list for the permutation
            for (int num : nums) {
                permutation.add(num); // Add each element of the array to the permutation list
            }
            result.add(permutation); // Add the permutation list to the result list
        } else {
            for (int i = start; i < nums.length; i++) { // Loop through the remaining elements
                swap(nums, start, i); // Swap the current element with the element at index i
                backtrack(nums, start + 1, result); // Recursively call backtrack with the next index
                swap(nums, start, i); // Swap the elements back to their original positions
            }
        }
    }

    // Utility function to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}