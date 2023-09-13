package Array.Day_17;

public class Search_Matrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16 }};
        System.out.println(Matrixs(arr, 7));
    }
    static int Matrixs(int arr[][],int tar){
        int m=arr.length;
        if(m==0){
            return-1;
        }
        int n=arr[0].length;
        int start=0;
        int end= m*n-1;
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
                return mid;
            }
        }
        return -1;
    }
}
