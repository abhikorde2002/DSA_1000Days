package Heap.Max;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Convert_Max_Min {
    public static void main(String[] args) {
        int arr[]={3, 4, 8, 11, 13};
        convertMinToMaxHeap(arr.length,arr);
        System.out.println(Arrays.toString(arr));
    }

    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
          for(int i=N/2-1;i>=0;i--){
              heapify(arr,N,i);
          }
      }
        static void heapify(int arr[],int n,int i) {
            int l = 2*i+1;
            int r = 2*i+2;
            int largest = i;
            if (l < n && arr[l] > arr[i]) largest = l;
            if (r < n && arr[r] > arr[largest]) largest = r;
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                heapify(arr,n,largest);
            }
        }
}
