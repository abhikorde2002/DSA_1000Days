package Array.Day_17;

public class Search_Infinite {
    public static void main(String[] args) {
        int arr[]={-8,20,27,47,29,35,55,56,58,60,100,100,100,100};
        System.out.println(search(arr, 100));
    }
    static int search(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
        int newStart=end+1;
        int newEnd=end+ (end-start+1)*2;
        start=newStart;
        end=newEnd;
        }
        return  bineary(arr, target, start, end,true);
    }
    static int bineary(int arr[],int target,int start,int end,boolean first){
           
           int ans=-1;
           while(start<=end){
            int mid=start+ (end- start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
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
