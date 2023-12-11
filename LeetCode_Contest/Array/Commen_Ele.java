package LeetCode_Contest.Array;

import java.util.Arrays;

public class Commen_Ele {
    public static void main(String[] args) {
        int arr[]={3,4,2,3};
        int num[]={1,5};
        System.out.println(Arrays.toString(element(arr, num)));
    }

    static int[] element(int arr[],int num[]){
        Arrays.sort(arr);
        Arrays.sort(num);
        int ab[]=new int[2];
         int len=0;
        for(int i=0;i<arr.length ; i++){
            int j=0;
           int cou=0;
            while (j<num.length) {
                if(arr[i]==num[j] ){     
                  len++;
                  j=num.length;
                } 
                j++;
            }  
              }
            ab[0]=len;
              int ans=0;
              for(int i=0;i<num.length ; i++){ 
                 int j=0;
             int cou=0;
             
             while (j<arr.length) {
                if(num[i]==arr[j] ){     
                  ans++;
                  j=arr.length;
                } 
                j++;
            }
            }
             ab[1]=ans; 
            return ab;
    } 
}
