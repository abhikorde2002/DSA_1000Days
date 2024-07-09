package Complete_Heap.MAX_Heap;

import java.util.Arrays;

public class Con_MIN_Max {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        convertMinToMaxHeap(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
          for(int i=N/2-1;i>=0;i--){
              heapify(arr,N,i);
          }
      }
        static void heapify(int arr[],int n,int i) {
            System.out.println(Arrays.toString(arr));
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
            System.out.println(Arrays.toString(arr));
        }
}
