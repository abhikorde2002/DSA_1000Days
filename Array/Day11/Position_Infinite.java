package Array.Day11;

public class Position_Infinite {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,11,13,15,16,17,19}; 
        System.out.println(ans(num, 11));
    }

    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int newStart=end+1;
            end= end +(end-start+1)*2;
            start=newStart;
        }
        return binearySearch(arr, target, start, end);
    }

    static int binearySearch(int arr[],int target,int start,int end){
        while(start<=end){
           int mid=start+(end-start)/2;
           if(target> arr[mid]) start=mid+1;
           else if(target < arr[mid])end=mid-1;
           else return mid;
        }
        return -1;
    }
}
