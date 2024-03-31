package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subset_Two {
    public static void main(String[] args) {
        int arr[]={10,5,2,6};
      //  System.out.println(subsets(arr));
        System.out.println(subsetsWithDup(arr));
    }
   
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
  // sorting
  Arrays.sort(nums);
  
  List<List<Integer>> result = new ArrayList<>();
  List<Integer> numList = new ArrayList<>();
  //result.add(new ArrayList<>());
  subsets(0, nums, numList, result, true);
  return result;
}

private static void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>> result, boolean isPicked) {
  // base case
  if (offset >= nums.length) {
    result.add(new ArrayList<>(numList)); 
    return;
  }
  int val = nums[offset];
  // duplicate checking (convert && to ||)
  if (offset == 0 || nums[offset - 1] != nums[offset] || isPicked == true) {
    // pick
    numList.add(val);
    subsets(offset + 1, nums, numList, result, true);
     // add to the result list
    System.out.println(result);
    numList.remove(numList.size() - 1);
  }
  // not pick
  subsets(offset + 1, nums, numList, result, false);
}
}
