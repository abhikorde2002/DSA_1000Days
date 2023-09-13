package Array.Day_11;

public class Flore_Number {
    public static void main(String[] args) {
         int arr[]={1,2,4,7,9,11,14,15,20,30};
         System.out.println(flore(arr, 16));
    }
      static int flore(int arr[],int target){
        int start =0 ;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else end = mid-1;

        }
        return end;
    }
}
