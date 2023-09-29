package Array.Day_23;

public class Single_Element {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        System.out.println(single(arr));
    }
   static int single(int nums[]){
    int start=0;
    int end=nums.length-1;
    if(end==0){
        return nums[0];
    }
    while(start<=end){
        int mid=start+(end-start)/2;
        if( (mid==0 ||nums[mid]!=nums[mid-1]) && ( mid==nums.length-1||nums[mid]!=nums[mid+1])){
            return nums[mid];
        }
        if(mid%2==0){
            if(nums[mid]==nums[mid+1]){
               start=mid+2;
            } 
            else {
                end=mid-1;
            }
        }
        else{
             if(nums[mid]==nums[mid-1] ){
              start=mid+1;
            } 
            else {
                 end=mid-1;
            }
        }
    }
    return -1;
}
   }



