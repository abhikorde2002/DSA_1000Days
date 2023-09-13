package Array.Day_13;

public class First_Number {
    public static void main(String[] args) {
        int arr[]={0, 0, 0, 0, 1, 1, 1};
        int start= bineary(1, arr, true);
        int end= bineary(1, arr, false);
        
        int sum=0;
        sum=end-start+1;
        System.out.println(sum);
    }
    static int bineary(int target,int arr[],boolean firstoccurance){ 
        int start =0;
        int ans=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[mid]>1){
                end= mid-1;
            }
            else if(arr[mid]< 1){
             start= mid+1;
            }
            else {
                ans=mid;
                if(firstoccurance){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}
