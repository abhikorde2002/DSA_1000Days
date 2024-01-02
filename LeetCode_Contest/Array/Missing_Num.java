package LeetCode_Contest.Array;

import java.util.Arrays;
import java.util.HashSet;

public class Missing_Num {
    public static void main(String[] args) {
       int arr[][]={{1,3}, {2,2}}; 
       System.out.println(findMissingAndRepeatedValues(arr));
       System.out.println(Arrays.toString(tryle(arr)));
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= grid.length * grid.length; i++) {
			set.add(i);
		}
		int x = 0;
		for (int[] i : grid) {
			for (int j : i) {
				x = set.remove(j) ? x : j;
			}
		}
		return new int[] { x, set.iterator().next() };
    }

    static int[] tryle(int arr[][]){
        int n= arr.length;
        int f[]=new int[n*n+1];
        for(int row[]:arr){
            for(int col:row)f[col]++;
        }
        int ans[]=new int[2];
        for(int i=1;i<=n*n;i++){
            if(f[i]==2)ans[0]=i;
            if(f[i]==0)ans[1]=i;
        }
        return ans;
    }
}
