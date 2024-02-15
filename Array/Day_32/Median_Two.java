package Array.Day_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median_Two {
    public static void main(String[] args) {
       int arr[]={1,2};
       int a[]={3,4};
       System.out.println(find(arr, a)); 
    }

    static double find(int nums1[],int nums2[]){
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged.add(nums1[i++]);
            } else {
                merged.add(nums2[j++]);
            }
        }
        
        while (i < nums1.length) merged.add(nums1[i++]);
        while (j < nums2.length) merged.add(nums2[j++]);
        
        int mid = merged.size() / 2;
        if (merged.size() % 2 == 0) {
            return (merged.get(mid-1) + merged.get(mid)) / 2.0;
        } else {
            return merged.get(mid);
        }
    }
}
