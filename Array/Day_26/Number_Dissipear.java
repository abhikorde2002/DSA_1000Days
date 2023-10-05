package Array.Day_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number_Dissipear {
    public static void main(String[] args) {
       int arr[] ={4,3,2,7,8,2,3,1};
       System.out.println(Search(arr));
    }
    static List<Integer> Search(int arr[]){
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
        System.out.println(Arrays.toString(arr));
        List<Integer> ans= new ArrayList<>();
        for(int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind+1){
                ans.add(ind+1);
            }
        }
        return ans;
    }
}
