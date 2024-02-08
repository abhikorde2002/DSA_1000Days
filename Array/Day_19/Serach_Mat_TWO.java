package Array.Day_19;

public class Serach_Mat_TWO {
    public static void main(String[] args) {
       int arr[][]={{-1,3},{4,5}};
       System.out.println(searchMatrix(arr, 4)); 
    }
    public static boolean searchMatrix(int[][] arr, int tar) {
        int start=0;
      int end=arr.length;
      while(start<=end){
    //    int mid=start + (end-start)/2;

       if(arr[start][end]==tar){
           return true;
       }
       if(arr[start][end]>tar){
           end--;
       }
       else if(arr[start][end]<tar){     
           start++;
       }
      }
      return false;
   }
   }


