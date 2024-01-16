package Array.Advance_Array;

import java.util.Arrays;

public class Majourity_Element {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
     public static int majorityElement(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int i=0;
        int cou=1;
        int max=1;
        int ans=0;
        while(i<arr.length){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                ++cou;
            }
            else{
                if(cou>max){
                    max=cou;
                    ans=arr[i];
                    cou=1;
                }
            }
            i++;
        }
        return ans;
    }
}
