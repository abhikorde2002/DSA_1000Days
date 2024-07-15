package Complete_Heap.MAX_Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class K_Weakest_Row {
    public static void main(String[] args) {
        int arr[][]={{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(kWeakestRows(arr, 3)));
    }
    

    public static int[] kWeakestRows(int[][] arr, int k) {
        List<int[]> s= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int val=Search(arr[i]);
            s.add(new int[]{val,i});
        }
        Collections.sort(s,new Comparator<int[]>() {
            @Override
          public int compare(int []a,int []b){
              return Integer.compare(a[0],b[0]);
          }
        });
        int weakest[]=new int[k];
        for (int i = 0; i < k; i++) {
            weakest[i]=s.get(i)[1];
        }
        return weakest;
    }


    public static int Search(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+ (end-start)/2;
            if(arr[mid]==1){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
