package Array.Day_20;

public class Search_2D_II {
    public static void main(String[] args) {
        int arr[][]={{1,4},{2,5}};
        System.out.println(matrix(arr, 2));
    }

    static boolean matrix(int arr[][],int tar){
        int m=arr.length-1;
        if(m==0){
            return false;
        }
        int n=arr[0].length;
        int start=0;
        int end= m*n;
        while(start<=end){
            int mid=start +(end-start)/2;
            int mid_Ele=arr[mid/n][mid%n];
            if(tar>mid_Ele){
                start=mid+1;
            }
            else if(tar<mid_Ele){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
