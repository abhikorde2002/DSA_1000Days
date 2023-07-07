package Array.Day5;

import java.util.Arrays;

public class Minimize {
    public static void main(String[] args) {
        int num[]={2, 6 ,3, 4 ,7 ,2, 10, 3, 2, 1};
        // minimize(num, 3);
        System.out.println(getMinDiff(num, num.length, 5));
    }

    static void minimize(int num[],int k){
        int differance;
        for(int i=0;i<num.length;i++){
            if(num[i]-k > 0){
                num[i]= num[i]-k;
            }
            else if(num[i]-k <=0) {
              num[i]=num[i]+k;
            }
        }
         differance=num[num.length-1]-num[0];
         System.out.println(differance);
        // for(int a:num){
        //     System.out.println(a);
        // }
    }

     public static int getMinDiff(int[] arr, int n, int k)
    {
 
        Arrays.sort(arr);
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];
 
        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];
 
        for (int i = 1; i < n; i++) {
 
            // if on subtracting k we got negative then
            // continue
            if (arr[i] - k < 0)
                continue;
 
            // Minimum element when we add k to whole array
            tempmin = Math.min(arr[0] + k, arr[i] - k);
 
            // Maximum element when we subtract k from whole
            // array
            tempmax
                = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
}
