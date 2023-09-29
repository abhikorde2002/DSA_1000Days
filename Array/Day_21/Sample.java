package Array.Day_21;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int arr[]={1,4,2,3};
        int num[]={-4,-3,6,10,20,30};
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                num[i]=num[i]*-1;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
