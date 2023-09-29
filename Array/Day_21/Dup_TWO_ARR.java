package Array.Day_21;

import java.util.Arrays;

public class Dup_TWO_ARR {
    public static void main(String[] args) {
        int arr[]={4,5,8};
        int num[]={10,9,1,8};
       System.out.println( findTheDistanceValue(arr, num, 2));;
    }
   public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i:arr1){
         ans= search(arr2,i,d);
         System.out.println(ans);
         ans+=arr2.length-ans;
        }
        return ans;
    } 
   static int search(int arr[],int tar,int d){
        int count=0;
        int start=0;
        Arrays.sort(arr);
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
                if(Math.abs(tar-arr[mid])<=d){
                    count=1;
                    break;
                }
                else if(tar-arr[mid]>d){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }           
        
    }
       return (count);
    }
}
