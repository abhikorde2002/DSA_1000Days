package Array.Day_15;

public class Odd_Occurance {
    public static void main(String[] args) {
       int arr[]={1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13}; 
       search(arr);
    }
    static void search(int arr[]){
        int start=0;
        int end=arr.length-1;
        // if(start>end)
        // return;
        // if(start==end){
        // System.out.println(arr[start]);
        // return;}
        while(start<=end){
            int mid=start + (end - start)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    start=mid+2;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]==arr[mid-1]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println(arr[start]);

    }
}
