package Sliding_Two_Pointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sub_Sum_k {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3};
       // System.out.println(subarraysWithKDistinct(arr, 2));
   
       System.out.println(Ans(arr,2));

    }

    public static int Ans(int[] nums, int k) {
        int subWithMaxK = Sub(nums, k);
        int reducedSubWithMaxK = Sub(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }
    
    public static int Sub(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            ans += right - left + 1; // Size of subarray
            right++;
        }
        
        return ans;
    }

    public static int subarraysWithKDistinct(int[] arr, int k) {
        int cou=0;
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> s= new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                s.add(arr[j]);
                if (s.size()==k) {
                    cou++;
                }
                if (s.size()>k) {
                    break;
                }
                
            }
        }
        return cou;
    }
}
