package Array.Day13;

public class Pivot {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
        System.out.println(peak(arr));
        System.out.println(peaks(arr));
        System.out.println(findPivot(arr));
    }

    static int peak(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
             if(mid>start && arr[mid]<arr[mid-1]){
                 return mid-1;
             }
             if(arr[start]>arr[mid]){
                 end=mid-1;
             }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int peaks(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
             if(mid>start && arr[mid]<arr[mid-1]){
                 return mid-1;
             }
             if(arr[mid]<=arr[start]){
                 end=mid-1;
             }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
