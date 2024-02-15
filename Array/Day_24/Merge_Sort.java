package Array.Day_24;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[]= {8,3,4,1,2,5,6};
        // System.out.println(Arrays.toString(Merge(arr)));
        System.out.println(Arrays.toString(arr));
        search(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
   
    static void search(int arr[],int start,int end){
        if((end-start)==1)return;

        int mid=start+ (end-start)/2;
        search(arr, 0, mid);
        search(arr, mid, end);

        Mix(arr,start,mid,end);
    }

    static void Mix(int arr[],int start,int mid,int end){
        int mix[]=new int[end-start];

        int i=start,j=mid,k=0;
        
        while (i<mid && j<end) {
             if(arr[i]<arr[j]){
                mix[k++]=arr[i];
                i++;
             }
             else{
                mix[k++]=arr[j];
                j++;
             }
        }
        while (i<mid) {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<end) {
            mix[k]=arr[j];
            j++;
            k++;
        }
         
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }

    }
    static int[] Merge(int arr[]){
        if(arr.length==1)return arr;
        
        int mid= arr.length/2;
        int left[]=Merge(Arrays.copyOfRange(arr,0,mid));
        int right[]=Merge(Arrays.copyOfRange(arr,mid,arr.length));

        return merge( left, right);
    }

    static int[] merge(int []start,int[] end){
        int mix[]=new int[start.length+end.length];
        int i=0,j=0,k=0;
        while (i<start.length && j<end.length) {
            if (start[i]>end[j]) {
                mix[k]=end[j];
                j++;
           }
           else{
            mix[k]=start[i];
            i++;
           }
           k++;
        }
        while (i<start.length) {
            mix[k]=start[i];
            i++;
            k++;
        }
        while (j<end.length) {
            mix[k]=end[j];
            j++;
            k++;
        }
        return mix;
    }
}
