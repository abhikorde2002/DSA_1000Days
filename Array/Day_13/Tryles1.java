package Array.Day_13;

public class Tryles1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0)); 
    }
   static int search(int arr[],int tar){
     int pivot=pivot(arr);
     if(pivot==-1){
        binary(arr, tar, 0, arr.length-1);
     }
     if(arr[pivot]==tar){
        return pivot;
     }
     if(tar>=arr[0]){
        binary(arr, tar, 0, pivot-1);
     }
     return binary(arr, tar, pivot+1, arr.length-1);
   }

   static int pivot(int arr[]){
     int start=0;
     int end=arr.length-1;
     while(start<=end){
        int mid=start + (end-start)/2;
        if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
            return mid;
        }
        else if(mid>0 && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        else if(arr[mid]<arr[start]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
     }
     return -1;
   }
   static int binary(int arr[],int tar,int start,int end){
         while(start<=end){
          int mid=start+ (end-start)/2;
          if(arr[mid]==tar){
            return mid;
          }
          else if(arr[mid]>tar){
            end=mid-1;
          }
          else{
            start= mid+1;
          }
         }
         return -1;
   }


}

