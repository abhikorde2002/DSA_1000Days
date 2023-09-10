package Array.Day17;
//Find the first index of target element.
//This quesion for Infinite array . condition is we are having all integers lies  on left hand side  and infinites lies on right hand side.
public class Find_FirstInd {
    public static void main(String[] args) {
        int arr[]={-23,40,45,1,2,27,-89,100,100,100,100,100};
        System.out.println(indexs(arr, 100, true));
    }
    static int indexs(int arr[],int target,boolean first){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
               if(first){
                end=mid-1;
               }
               
            }
        }
        return ans;
    }
}
