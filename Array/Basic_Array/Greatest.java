package Array.Basic_Array;

import java.util.LinkedList;
import java.util.List;

public class Greatest {
    public static void main(String[] args) {
       List arr= new LinkedList<>();
       arr.add(3) ;
       arr.add(5);
       arr.add(6);
       arr.add(8);
       arr.add(7);
     
      // System.out.println(findGCD(arr));
      System.out.println(sumMultiples(22));
       

    }

    public static int findGCD(List<Integer> nums) {
        // write your code here
            int max=Integer.MAX_VALUE;
            int min=Integer.MIN_VALUE;
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<nums.size();i++){
                max=Math.min(max,nums.get(i));
                min= Math.max(min, nums.get(i));
            }

            for(int i=1;i<min;i++){
                if(max%i==0 && min%i==0){
                    ans=Math.max(ans, i);
                }
            }
            return ans;

    }
    public static int sumMultiples(int n) {
		// write your code here
		
		int sum=0;
		for(int i=1;i<=n;i++){
		    if( i%3==0 || i%5==0 || i %7==0  ){
		        sum+=i;
		    }
		}
		return sum;
	}
}
