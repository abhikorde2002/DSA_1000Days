package Array.Day_16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kth_diff {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.println(findPairs(arr, 1));
       System.out.println(Counts(arr, 2));
       System.out.println(Two_Point(arr, 1));
    }
    // (O n Log N)
    public  static int findPairs(int[] nums, int k) {
 		Set<Integer> uniquePair = new HashSet();
 		Arrays.sort(nums);
 		int n = nums.length;

 		for (int i = 0; i < n - 1; i++)
 			if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
 				uniquePair.add(nums[i]);
         System.out.println(uniquePair);
 		return uniquePair.size();
 	}
//Time complexity Will be O(n square)
    static int Counts(int arr[],int k){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                for(int j=i+1;j<arr.length;j++){
                    if((arr[j]-arr[i])==k){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
//Two Pointer (O N Log N)
    
     static int Two_Point(int arr[],int k){
        Arrays.sort(arr);
        int a=0;
        int b=1;
        int count=0;
        while(a<arr.length && b<arr.length){
            if(a==0 || arr[a]!=arr[a-1] ){
                if(arr[b]-arr[a]==k){
                    count++;
                    a++;
                    b++;
                }
            }
            else if(arr[b]-arr[a] > k){
                a++;
            }
            else{
                b++;
            }
        }
        return count;
     }
}
