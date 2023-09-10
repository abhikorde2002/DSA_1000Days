package Array.Day17;

import java.util.Arrays;

public class Pairs_Bineary {
    public static void main(String[] args) {
        int arr[]={20,40,60,80,90,120,240};
        System.out.println(Arrays.toString(pairs(arr, 210)));
         System.out.println(Arrays.toString(Two_pointer(arr, 210)));
    }
    static int[] pairs(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]+arr[mid+1]<target){
                start=mid+1;
            }
            else if(arr[mid]+arr[mid+1]> target){
                end=mid;
            }
            else if(arr[mid]+arr[mid-1]==target){
             return new int[]{mid,mid-1};
            }
            else if(arr[mid]+arr[mid+1]==target){
                return new int[]{mid,mid+1};
            }
        }
        return new int[0];
    } 
     
}
