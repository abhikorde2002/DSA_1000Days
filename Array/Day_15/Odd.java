package Array.Day_15;

import java.util.HashSet;

public class Odd {
    public static void main(String[] args) {
        int arr[] ={2, 2, 2, 4, 4, 4,5, 5, 5,5, 6, 8, 8, 9};
        search(arr);
    }
    static void search(int arr[]){
        HashSet<Integer> str= new HashSet<>();
        
        for(int i:arr){
            if(i%2==1 ){
                str.add(i);
            }
        }
        for(int a:str){
            int start=bineary(a, arr, true);
            int end=bineary(a, arr, false);
            int sum=end -start+1;
             System.out.println( a+" "+sum);
        }
    }
    static int bineary(int target,int arr[],boolean firstoccurance){
        int start =0;
        int ans=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[mid]>target){
                end= mid-1;
            }
            else if(arr[mid]< target){
             start= mid+1;
            }
            else {
                ans=mid;
                if(firstoccurance){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }      
    }
    return ans;
    }
}
