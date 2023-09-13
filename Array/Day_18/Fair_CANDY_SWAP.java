package Array.Day_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fair_CANDY_SWAP {
    public static void main(String[] args) {
       int arr[]={1,2};
       int num[]={2,3};
       
       System.out.println(Arrays.toString(candySwap(arr, num)));
       System.out.println(Arrays.toString(Tryles(arr, num)));
    }
    
    static int[] candySwap(int arr[],int num[]){
      int rohitTotal=0;
      int samTotal=0;
      for(int candie:arr){
        rohitTotal+=candie;
      }
      for(int candies:num){
        samTotal+=candies;
      }
      int n=arr.length,m=num.length;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if((rohitTotal-arr[i]+num[j])==(samTotal-num[j]+arr[i])){
                return new int[]{arr[i],num[j]};
            }
        }
      }
      return new int[0];
    }

    static int[] Tryles(int arr[],int num[]){
      int total=0;
      int sum=0;
      for(int a:arr){
        total+=a;
      }
      for(int j:num){
         sum+=j;
      }
      int start=0;
      int end=0;
      int i=0;
      int k=0;
      while(i<arr.length && k<num.length){
        start=i;
        end=k;
        if((total -arr[start]+num[end])== (sum-num[end]+arr[start])){
          return new int[]{arr[start],num[end]};
        }
        else if(k>num.length) {
             i++;
        }
          k++;
        
      }
      return new int[0];
    }
}
