package Array.Day_31;

import java.util.Arrays;

public class Aggracev_Cow {
    public static void main(String[] args) {
        int arr[]={0,3,4,7,10,9};
          System.out.println(Cows(arr, 4));
        //  System.out.println(aggressiveCows(arr, 4));
        //  System.out.println(posibls(arr, 4));
    }

    //Simple Approach with O(N* Log N) time complexity
    static int Cows(int arr[],int count){
      Arrays.sort(arr);
      int start=0;
      int ans=1;
      int end=1;
      int sum=Integer.MIN_VALUE;
      int n=arr[arr.length-1];
      for(int i=1;i<n/2;i++){
      while(ans<=count && end<arr.length){
        if(arr[end]-arr[start]>=i){
            start=end;
            ans++;
        }
        else{
            end++;
        }
        if(ans==count){
            ans=i;
        }
      }
      sum= Math.max(ans, sum);

    }
return sum;
    }
    
    //Simple Approach with O(N* Log N) time complexity
    static boolean canwePlac(int arr[],int dist,int cows){
        int n=arr.length;
        int total=1;
        int start=arr[0];
        for(int i=1;i<n;i++){
          if(arr[i]-start>=dist){
            total++;
            start=arr[i];
          }
          if(total>=cows){
            return true;
          }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length; //size of array
        //sort the stalls[]:
        Arrays.sort(stalls);

        int limit = stalls[n - 1] - stalls[0];
        for (int i = 1; i <= limit; i++) {
            if (canwePlac(stalls, i, k) == false) {
                return (i - 1);
            }
        }
        return limit;
    }
    static int posibls(int arr[],int count){
        Arrays.sort(arr);
        int limit=arr[arr.length-1]-arr[0];
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            boolean ans=canwePlac(arr, mid,count);
            if(ans==true){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
 
        }
        return end;
    }
}
