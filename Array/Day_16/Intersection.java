package Array.Day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        
    }

    static int search(int num[],int num2[]){
          Set<Integer> sh= new HashSet<>();
        for(int i:num){
            sh.add(i);
        }
     Set<Integer> sh1= new HashSet<>();
        for(int a:num2){
            sh1.add(a);
        }
        for(int j:sh1){
            for(int b:sh){
           bineary(b, j);
        }
        }
        
    }
    static void bineary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]==target){
                ans=arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
        System.out.println(ans);
        
    }
}
