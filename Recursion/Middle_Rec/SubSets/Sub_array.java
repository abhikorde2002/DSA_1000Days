package Recursion.Middle_Rec.SubSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sub_array {
    public static void main(String[] args) {
       int arr[]={10,5,2,6};
       
        List< Integer> s= new ArrayList<>();
       System.out.println( subset(arr));
        // for(List<Integer> a:subset(arr)){
        //       s.addAll(a);
        // }
        // System.out.println(s);
    }

    public static List<List<Integer>> subset(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>(); // initialize the answer list

        ArrayList<Integer> subset = new ArrayList<>(); // initialize the subset list

        helper(nums, 0, subset, ans); // call the recursive helper function with initial values
       
        return ans; // return the answer list
    }

    public static void helper(int nums[], int i, ArrayList<Integer> subset, List<List<Integer>> ans){
        
        // base case: if the index i has reached the end of the array, add the current subset to the answer list and return
        if(i == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        // add the current element to the subset and recursively call the helper function with the next index
        subset.add(nums[i]);
        helper(nums, i + 1, subset, ans);

        // remove the last element from the subset and recursively call the helper function with the next index
        subset.remove(subset.size()-1);
        helper(nums, i + 1, subset, ans);
    }
    
     public static List<List<Integer>> subsets(int[] arr) {
       List<List<Integer>> out= new ArrayList<>();
       out.add(new ArrayList<>());

       int start=0,end=0;
       for(int i=0;i<arr.length;i++){
           int n=out.size();
           if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
           }
           end=out.size();
           for(int j=start;j<n;j++){
               List<Integer> s= new ArrayList<>(out.get(j));
               s.add(arr[i]);
               out.add(s);
           }
       }
       return out;
     }
}
