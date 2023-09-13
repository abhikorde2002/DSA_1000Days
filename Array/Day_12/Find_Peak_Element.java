package Array.Day_12;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int nums []= {1,2,3,4,1};
       System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start + (end-start)/2;
            if(arr[mid]>arr[mid+1])end=mid;
            else start=mid+1;
        }
        return start;
    }
}
