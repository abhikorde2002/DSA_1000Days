package Array.Advance_Array;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
         rotate(arr);
    }

    public static void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 int tem=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=tem;
            }
        }
  
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int tem=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=tem;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
      }
}
