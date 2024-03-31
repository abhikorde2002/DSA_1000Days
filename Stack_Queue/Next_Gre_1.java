package Stack_Queue;

import java.util.Arrays;

public class Next_Gre_1 {
    public static void main(String[] args) {
        int arr[]={4,1,2};
        int num[]={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(arr, num)));
    }
    
    public static int[] nextGreaterElement(int[] arr, int[] num) {
        int val[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=0;
            while(j<arr.length && num[j]!=arr[i]){
                j++;
            }
    
            while(j<num.length){
                if(arr[i]<num[j]){
                    val[i]=num[j];
                    break;
                }
                else if(arr[i]>=num[j] && num.length-1==j){
                    val[i]=-1;
                    break;
                }
                j++;
            }
        }
        return val;
    }

}
