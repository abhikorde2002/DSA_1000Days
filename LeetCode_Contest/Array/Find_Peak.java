package LeetCode_Contest.Array;

import java.util.ArrayList;
import java.util.List;

public class Find_Peak {
    public static void main(String[] args) {
        int a[]={2,4,4};
        System.out.println(findPeaks(a));
    }

    public static List<Integer> findPeaks(int[] arr) {
        List<Integer> str= new ArrayList<>();
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    str.add(i);
                }
            }
            return str;
        }
    
}
