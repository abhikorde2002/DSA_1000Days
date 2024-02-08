package Array.Day_27;

public class MInimum_Rotated {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(Rotated(arr));
        System.out.println(pivot(arr));
    }

    static int Rotated(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[end]){
                end=mid;
            }
            else if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
 
               end--;
            }
        }
        return arr[start];
    }
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length;
        while (start<=end) {
            int mid=start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
