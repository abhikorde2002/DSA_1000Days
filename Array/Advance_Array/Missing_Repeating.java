package Array.Advance_Array;

import java.util.Arrays;

public class Missing_Repeating {
    public static void main(String[] args) {
        int ans[]=new int[2];
        int num[]={1,2,3,3};
        ans[0]=missingNumber(num);
        ans[1]=dupli(num);
        System.out.println(Arrays.toString(ans));
    }

    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]<arr.length &&arr[i]!=arr[index]){
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
                return ind+1;
            }
        }
        return arr.length+1;
    }
    public static int dupli(int[] arr) {
        int ans=-1;
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]<arr.length &&arr[i]!=arr[index]){
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
                ans= arr[ind];
            }
        }
        return ans;
    }
}
