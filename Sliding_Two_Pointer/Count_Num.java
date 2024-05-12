package Sliding_Two_Pointer;

import java.util.Arrays;

public class Count_Num {

    public static void main(String[] args) {
        int arr[]={2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(arr, 2));
        
     }


     public static int[]conver(int arr[]){
        int val[]=new int[arr.length];
        for (int i = 0; i < val.length; i++) {
            if(arr[i]%2!=0){
                val[i]=1;
            }
            else{
                val[i]=0;
            }
        }
        return val;
     }
     static int Answer(int arr[],int g){
        int val[]=conver(arr);
        int left=0,right=0,sum=0;
        int tem=0;
        int cou=0;
        while (right<val.length) {
            sum+=val[right];
            if (val[right]%2!=0) {
                tem=0;
            }
            while (sum==g && left<=right) {
                tem++;
                sum-=val[left++];
            }
            cou+=tem;
            right++;
        }
        return cou;
     }



    public static int[] conversion(int arr[]){
        int num[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                num[i]=1;
            }
            else{
            num[i]=0;
            } 
        }
       
        return num;
    }
    public static int numberOfSubarrays(int[] val, int g) {
        int arr[]=conversion(val);
    
        int cou=0,sum=0,left=0,right=0,tem=0;
        while(right<arr.length){
            sum+=arr[right];
            if(arr[right]==1)tem=0;
            if(sum>g){
                sum-=arr[left];
                left++;
            }
            while(sum==g && left<=right){
                tem+=1;
                sum-=arr[left];
                left++;
            }
            cou+=tem;
            right++;
        }
        return cou;
    }
     
}