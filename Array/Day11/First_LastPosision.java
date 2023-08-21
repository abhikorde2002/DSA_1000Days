package Array.Day11;

import java.util.Arrays;

public class First_LastPosision {
    public static void main(String[] args) {
        int num[]={5,7,7,7,8,8,9};
      first_Last(num, 7);
    }
    

    static int first_Last(int arr[],int target){
        int ans[]={-1,-1};
        int sum=0;
        int start =search(arr, target, true);
        int end=search(arr, target, false);
        ans[0]=start;
        ans[1]=end;
        sum= ans[1]-ans[0]+1;
        System.out.println(sum);
        return sum;
    }

    static int search(int arr[],int target,boolean firstoccurance){
        int start=0;
        int ans=-1;

        int end=arr.length;

        while (start<=end){
            int mid=start +(end-start)/2;
             
            if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end= mid-1;
            }
            else{
                //Potensial ans fount
                ans=mid;
                if(firstoccurance){
                   end=mid-1;
                   
                }
                else{
                    start= mid+1;
                }
            }
        }
        return ans;

    }
}
