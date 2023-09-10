package Array.Day11;

public class Position_Infinite {
    public static void main(String[] args) {
        // int num[]={1,2,3,4,5,6,7,8,9,11,13,15,16,17,19}; 
        int num[]={-8,20,27,47,29,35,55,56,58,60,100,100,100,100};
        System.out.println(ans(num, 100));
    }

    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int newStart=end+1;
            end= end +(end-start+1)*2;
            start=newStart;
        }
        return binearySearch(arr, target, start, end,true);
    }

    static int binearySearch(int arr[],int target,int start,int end,boolean first){
        int ans=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(target> arr[mid]) start=mid+1;
           else if(target < arr[mid])end=mid-1;
           else {
            ans=mid;
            if(first){
                end=mid-1;
            } 
            else{
                start=mid+1;
            }
           }
        }
        return ans;
    }
}
