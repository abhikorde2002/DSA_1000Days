package Array.Day_15;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={5,9,11,13};
         System.out.println(missing(arr));
        
    }

    static int missing(int arr[]){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start + (end-start)/2;
            int diff=(arr[arr.length-1]-  arr[0]) /2;
            System.out.println(diff);

            if(arr[mid-1]+diff ==arr[mid]){
                start = mid+1;
            }
            if(arr[mid]+diff != arr[mid+1]){
                return arr[mid]+diff;
            }
            else if(arr[mid-1]+diff !=arr[mid]){
                return arr[mid-1]+2;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
