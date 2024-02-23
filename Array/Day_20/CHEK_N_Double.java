package Array.Day_20;

import java.util.Arrays;

public class CHEK_N_Double {
    public static void main(String[] args) {
        int arr[]={10, 2 ,5 ,3};
        System.out.println(exists(arr));
        System.out.println(bineary(arr));
    }

    static boolean exists(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2*arr[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean bineary(int arr[]){
          Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
         int target=arr[i]*2;
         int start=0,end=arr.length-1;
         while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target && arr[mid]!=i){
                return true;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
         }
        }
        return false;
    }
}
