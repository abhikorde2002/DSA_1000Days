package Array.Day12;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int nums []= {1,2,3,1};
       findPeakElement(nums);
    }

    public static void findPeakElement(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>arr[mid+1])end=mid;
            else if(arr[mid]<arr[mid+1])end=mid+1;
        }
        System.out.println(end);
    }
}
