package Array.Day_8;

import java.util.Arrays;

public class Triple_Sum {
    public static void main(String[] args) {
        int A[]={1 ,4 ,45 ,6 ,10 ,8};
        System.out.println(find3Numbers(A, 6, 13));
    }
    
    
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
    //   int count =0;
    // for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         for(int k=j+1;k<n;k++){
    //             if(A[i]+A[j]+A[k]==X){
    //                 count++;           
    //             }
    //         }
    //     }
    // }
    // return (boolean)count;
    // Arrays.sort(A);
    // int sum=0;
    // for(int i=0;i<n;i++){
    //     int low=i+1;
    //     int high=n-1;
    //     while(low<high){
    //         sum=A[i]+A[low]+A[high];
    //         if(sum==X){
    //             return true;
    //         }
    //         else if(sum<X){
    //             low=low+1;
    //         }
    //         else{
    //             high=high-1;
    //         }
    //     }
        
    // }
    //  return false;

    Arrays.sort(A);
    int sum=0;
    for(int i=0;i<n;i++){
            int low=i+1;
            int end=n-1;
    while(low<end){
      sum=A[i]+ A[low]+A[end];
      if(sum==X)return true;
       else if(sum<X)low=low+1;
       else end=end-1;
    }}
    return false;
    }
    

}
