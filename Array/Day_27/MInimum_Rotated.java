package Array.Day_27;

public class MInimum_Rotated {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(Rotated(arr));
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
}
