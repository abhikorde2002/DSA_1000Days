package Array.Day_27;

public class Search_Rotated {
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        System.out.println(Search(arr, 3));
    }
    static boolean Search(int arr[],int tar){
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==tar){
            return true;
        }
        if(arr[mid]>arr[start]){
            if(arr[mid]>tar && tar>=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else if(arr[mid]<arr[end]){
            if(arr[mid]<tar && tar<=arr[end]){
               start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        else{
            start++;
        }

      }
      return false;
    }
    
}
