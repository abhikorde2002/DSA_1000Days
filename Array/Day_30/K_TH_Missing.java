package Array.Day_30;

import java.util.ArrayList;
import java.util.List;

public class K_TH_Missing {
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        //  System.out.println(findKthPositive(arr, 1));
        System.out.println(Positives(arr, 5));
        System.out.println(Positives_1(arr, 5));
    }
     public static int findKthPositive(int[] arr, int k) {
        List<Integer> str= new ArrayList<>();
        int start=0;
        int b=0;
        int ans=arr[arr.length-1] ;
        for(int i=1;i<ans-1;i++){
            if(arr[start]!=i){
                str.add(i);
            }
            else{
                start++;
                
            }
        }
        if(str.isEmpty()){
            return arr[arr.length-1]+k;
        }
        for(int a:str ){
            arr[b++]=a;
        }
        return arr[k-1];
        
    }

    static int Positives(int arr[],int k){
        int minimum=0;
        int num=1;
        int i=0;
        while(minimum<k){
            if(i<arr.length && arr[i]==num){
                i++;
            }
            else{
                minimum++;
            }
            if(minimum==k){
                return num;
            }
            num++;
        }
        return -1;
    }

    static int Positives_1(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int min=arr[mid]-(mid+1);
            if(min<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return k+end+1;
    }
}
