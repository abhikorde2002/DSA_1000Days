package Array.Day7;

import java.util.Arrays;

public class Rearrange_Array {
    public static void main(String[] args) {
        int num[]={3,1,-2,-5,2,-4};
     reverse(num);

    }

    static int[] reverse(int arr[]){
        int pos=1,neg=0;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
