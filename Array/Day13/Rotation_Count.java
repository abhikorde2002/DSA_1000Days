package Array.Day13;

public class Rotation_Count {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        System.out.println(count(arr));
        System.out.println(counts(arr));
    }

    static int count(int arr[]){
        int pivot=peaks(arr);
        return pivot+1;
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

    static int counts(int arr[]){
        int n=arr.length;
        if(arr[0]>arr[n-1]){
           for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
           }

        }
        return 0;
    }
}
