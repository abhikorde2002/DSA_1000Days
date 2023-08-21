package Array.Day13;

public class Count_occurance {
    public static void main(String[] args) {
        int arr[]={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int start =bineary(5, arr, true);
        int end= bineary(5, arr, false);
        int ans[]={-1,-1};
        ans[0]=start;
        ans[1]=end;
        int sum=ans[1]-ans[0]+1;
        System.out.println(sum);
    }

    static int bineary(int target,int arr[],boolean firstoccurance){
        int start =0;
        int ans=0;
        int end=arr.length;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[mid]>target){
                end= mid-1;
            }
            else if(arr[mid]< target){
             start= mid+1;
            }
            else {
                ans=mid;
                if(firstoccurance){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}
