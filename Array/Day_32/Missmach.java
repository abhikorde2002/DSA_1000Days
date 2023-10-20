package Array.Day_32;

import java.util.Arrays;

public class Missmach {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
              int tem=arr[i];
               arr[i]=arr[index];
               arr[index]=tem;
            }
            else{
                i++;
            }
        }
        for(int ind=0;ind<arr.length;ind++){
              if(arr[ind]!=ind+1){
                  return new int[] {arr[ind], ind+1};
              }
          }
          return new int[]{-1,-1};
      }
}
