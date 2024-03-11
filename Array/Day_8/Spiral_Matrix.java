package Array.Day_8;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
     public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Matrix(arr));
     }

     static List<Integer> Matrix(int arr[][] ){
       List<Integer> s= new ArrayList<>();
       int top=0;
       int left=0;
       int bottum = arr.length-1;
       int right=arr[0].length-1;
       while (true) {
        for(int i=left;i<=right;i++)
            s.add(arr[top][i]);
            top++;
            if(left>right || top>bottum)break;
         
        for(int i=top;i<=bottum;i++)
            s.add(arr[i][right]);
            right--;
            if(left>right || top>bottum)break;    
        
        for(int i=right;i>=left;i--)
            s.add(arr[bottum][i]);
            bottum--;
            if(left>right || top>bottum)break;  
        
        for(int i=bottum;i>=top;i--)
            s.add(arr[left][i]);
            left++;
            if(left>right || top>bottum)break;      
       }

       return s;
     }
}
