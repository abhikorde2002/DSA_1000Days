package Array.Day_24;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        System.out.println(Arrays.toString(Sorts(arr)));
    }

    static int[] Sorts(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int tem=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tem;
                    j--;
                }
                else{
                    break;
                }
                
            }
        
        }
        return arr;
    }
}
