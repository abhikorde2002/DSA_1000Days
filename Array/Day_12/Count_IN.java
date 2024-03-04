package Array.Day_12;

import java.util.ArrayList;

public class Count_IN {
    public static void main(String[] args) {
        long arr[]={2,4,1,3,5};
        int num[]={2,4,1,3,5};
        System.out.println(inversionCount(arr, 5));
        System.out.println(interval(arr, 5));
      //  System.out.println(Inversion(num));
    }
    static int Inversion(int arr[]){
        int cou=0,start=1;
        for(int i=0;i<arr.length-1;){
            if(arr[i]>arr[start] && start<arr.length){
                cou++;

            }
            else if(i<arr.length && start==arr.length){
                start=i+1;
                i++;
            }
            start++;
        }
        return cou;
    }

    static long inversionCount(long arr[], long N)
    { 
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i] > arr[j] ){
                count++;
            }
            }
        }
        return count;
}

    static long interval(long arr[],long N){
        int count=0;
        int i=0,j=i+1;
        while(i<N && j<N){
            if(arr[i]>arr[j]){count++;
                 j++;
            }else{
            i++;
            }
        }
        return count;
    }
     static long inversionCounts(long arr[], long N)
    {
        // Your Code Here
       
        return  mergeSort(arr,0,N-1);
       
    }
    static long merge(long[] arr, long low, long mid, long high) {
        ArrayList<Long> temp = new ArrayList<>(); // temporary array
        long left = low;      // starting index of left half of arr
        long right = mid + 1;   // starting index of right half of arr
   long count=0;
        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add(arr[(int)left]);
                left++;
            } else {
                temp.add(arr[(int)right]);
                count+= (mid- left +1);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[(int)left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[(int)right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i =(int) low; i <= high; i++) {
            arr[i] = temp.get(i - (int)low);
        }
        return count;
    }

    public static long mergeSort(long[] arr, long low, long high) {
           long count=0;
           if(low<high){
        long mid = (low + high) / 2 ;
       count+= mergeSort(arr, low, mid);  // left half
       count+=    mergeSort(arr, mid + 1, high); // right half
       count+=    merge(arr, low, mid, high);  // merging sorted halves
           }
       return count;
    }

      
}

