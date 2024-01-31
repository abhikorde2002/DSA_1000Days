package Array.Advance_Array;

import java.util.Arrays;

public class Minimum_Sum {
    public static void main(String[] args) {
        int[] arr = {0 ,0 ,0 ,0 ,0};
		int N = arr.length;

		// Function call
		System.out.print("Sum is " + solve(arr, N));
    }
     static String revers(String str){
       StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    static String solve(int[] arr, int n) {
        // code here
         String  a = "";
        String b = "";
        Arrays.sort(arr);

        // for (int i = 0; i < n; i++) {
        //     if (i % 2 == 0) {
        //       a += Integer.toString(arr[i]);
        //     } else {
        //       b += Integer.toString(arr[i]);
        //     }
        // }
        for (int i = 0; i < n; i += 2) {
			a += Integer.toString(arr[i]);
		}
		for (int i = 1; i < n; i += 2) {
			b += Integer.toString(arr[i]);
		}
        
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String ans="";
        
        while(j>=0 && i>=0){
            int sum=0;
            sum+=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
            int x=sum%10;
            ans+=Integer.toString(sum%10);
            carry=sum/10;
            j--;
            i--;
        }
        
        while(i>=0){
            int sum=0;
            sum+=(a.charAt(i)-'0')+carry;
             ans += Integer.toString(sum % 10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
              int sum=0;
            sum+=(b.charAt(j)-'0')+carry;
             ans += Integer.toString(sum % 10);
            carry=sum/10;
            j--;
        }
        if(carry!=0){
            ans+=Integer.toString(carry);
        }
        while (ans.isEmpty() == false
               && ans.charAt(ans.length() - 1) == '0')
            ans = ans.substring(0, ans.length() - 1);
            
        ans=revers(ans);
        return ans.isEmpty()? "0":ans;
    }
}
