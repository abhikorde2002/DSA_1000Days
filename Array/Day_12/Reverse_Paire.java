package Array.Day_12;

import java.util.ArrayList;

public class Reverse_Paire {
    public static void main(String[] args) {
        
    }
     public int reversePairs(int[] arr) {
       
        return  mergeSort(arr,0,arr.length-1);
    }
      static int merge(int[] arr, int low, int mid, int high) {
          int count=0;
          int j = mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]>(2*(long)arr[j])){
                j++;
            }count+=j-(mid+1);
        }
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
               
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i =(int) low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }
    int mergeSort(int arr[],int low , int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;     
        int count= mergeSort(arr, low, mid);  // left half
        count+=    mergeSort(arr, mid + 1, high); // right half
        count+=    merge(arr, low, mid, high); 
        return count;
        }
}
