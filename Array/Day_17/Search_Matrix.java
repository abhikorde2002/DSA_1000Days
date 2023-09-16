package Array.Day_17;

public class Search_Matrix {
    public static void main(String[] args) {
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16 }};
         int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
       //int arr[][]={{-1,3}};
        System.out.println(Matrixs(arr, 5));
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
