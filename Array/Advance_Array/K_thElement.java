package Array.Advance_Array;

// Java code for the above approach

import java.util.Arrays;
import java.util.Collections;

class K_thElement {

	public static String reverseString(String str)
	{

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public long kthElement( int arr[], int num[], int m, int n, int b) {
		int[] ans=new int[m+n];
		   int i = 0;  
		   int j = 0;  
		   int k = 0;  
			
		   // traverse the arr and insert its element in arr3
		   while(i < m){   
			ans[k++] = arr[i++];   
		   }   
			
		   // now traverse num and insert in ans
		   while(j < n){   
			ans[k++] = num[j++];   
		   }   
			
		   // sort the whole array ans
		   Arrays.sort(ans); 

		   return ans[b-1];  
	   
   }
}

// This code is contributed by Chhavi
