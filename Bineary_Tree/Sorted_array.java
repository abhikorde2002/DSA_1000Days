package Bineary_Tree;

import java.util.ArrayList;
import java.util.List;

public class Sorted_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        ArrayList<Integer>  str= new ArrayList<>(); 
        sort(arr, str, 0, arr.length);
        System.out.println(str);
    }

    static void sort(int arr[],ArrayList<Integer> str,int left,int righ){
      if(left>=righ){
        return; 
      }
      int mid=left+ (righ-left)/2;
      str.add(arr[mid]);
      sort(arr, str, left, mid);
      sort(arr, str, mid+1, righ);

    }
}
