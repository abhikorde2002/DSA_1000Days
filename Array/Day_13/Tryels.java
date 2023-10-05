package Array.Day_13;

public class Tryels {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }

    static int search(int arr[],int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]>arr[start]){
              if(arr[mid]>tar && arr[start]<=tar){
                end=mid-1;
              }
              else{
                start = mid+1;
              }
            }
            else if(arr[start]>arr[mid]){
               if(arr[mid]<tar && arr[end]>=tar){
                 start = mid+1;
              }
              else{
               end=mid-1;
              }
            }
            else{start++;}
        }
        return -1;
    }
    
}
