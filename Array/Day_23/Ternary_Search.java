package Array.Day_23;

public class Ternary_Search {
    public static void main(String[] args) {
         int arr[]={20,25,47,56,59,63,65,79,82};
         System.out.println(Search(arr, 79, 0, arr.length-1));
    }

    static int Search(int arr[],int tar ,int start ,int end){
        while(start<=end){
            int mid1=start + (end-start)/3;
            int mid2=end - (end-start)/3;
            if(arr[mid1]==tar){
                return mid1;
            }
            if(arr[mid2]==tar){
                return mid2;
            }
            else if(arr[mid1]>tar){
               return Search(arr, tar, start, mid1-1);
            }
            else if(arr[mid2]<tar){
                return Search(arr, tar, mid2+1, end);
            }
            else{
              return Search(arr, tar, mid1+1, mid2-1);
            }
        }
        return -1;
    }
}
