package Array.Day_26;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(missingNumber(arr));
        System.out.println(Search(arr));
    }
    
   
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
          int start=0;
            int end=arr.length-1;
            while(start<=end){        
            int mid=start + (end - start) /2  ;
            if(arr[mid]== mid){
                start=mid+1;
            } 
            else {
               end=mid-1;
            }
        }
        return start;
    
}     
    static int Search(int arr[]){
        int i=0;
        while(i<arr.length){
            int index=arr[i];
            if(arr[i]<arr.length &&arr[i]!=arr[index]){
                int tem=arr[i];
                arr[i]=arr[index];
                arr[index]=tem;
            }
            else{
                i++;
            }
           }
        for(int ind=1;ind<arr.length;ind++){
            if(arr[ind]!=ind){
                return ind;
            }
        }
        return arr.length;
    }
}
