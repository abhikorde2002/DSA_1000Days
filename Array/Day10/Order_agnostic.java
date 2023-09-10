package Array.Day10;

public class Order_agnostic {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,9,11,14,15,20,30};
        System.out.println(order(arr, 16));
    }

    static int order(int arr[],int key){
       int n=arr.length;
      int start=0,end=n-1;
      boolean isAsc=arr[start]<arr[end];
      while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(isAsc){
                 if(key<arr[mid]){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
            }
            else{
                 if(key>arr[mid]){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
            }

         }
         return -1;
    }
   
}
