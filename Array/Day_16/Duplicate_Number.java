package Array.Day_16;

public class Duplicate_Number {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int start=1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            int count=0;
            for(int i:arr){
                if(i<=mid){
                ++count;
                }
            }
            if(count<=mid){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return start;
     }
}
