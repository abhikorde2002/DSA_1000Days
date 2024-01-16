package Array.Advance_Array;

public class Sort_Color {
    public static void main(String[] args) {
     int arr[]={2,0,2,1,1,0};
     sortColors(arr);   
    }

    public static void sortColors(int[] arr) {
        int low = 0, high = arr.length - 1;

       for (int i = 0; i <= high; i++) {
           if (arr[i] == 0) {
               int temp = arr[i];
               arr[i] = arr[low];
               arr[low] = temp;
               low++;
           } else if (arr[i] == 2) {
               int temp = arr[i];
               arr[i] = arr[high];
               arr[high] = temp;
               high--;
               i--; 
               // Decrement i because we need to recheck the current position after swapping.
           }
       }}
}
