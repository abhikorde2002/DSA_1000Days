package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
     public static void main(String[] args) {
        int arr[]={2,3,5};
        System.out.println(combinationSum(arr, 8));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Sub(candidates, target, 0, sub, result);
        return result;
    }

     static void Sub(int[] candidates, int target, int startIndex,
                                            List<Integer> sub, List<List<Integer>> result) {
        if (target == 0) {
            // Add a copy of the current combination to the result
            result.add(new ArrayList<>(sub));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                // Include the current candidate in the combination
                sub.add(candidates[i]);
                // Recursively search for combinations with the remaining target
                Sub(candidates, target - candidates[i], i, sub, result);
                // Backtrack by removing the last added element to try other combinations
                sub.remove(sub.size() - 1);
            }
        }
    }
}
