package Array.Day17;

public class Peak_Element {
    public static void main(String[] args) {
    //  int nums[] = {4,5,1,2,3};
    int nums[]={4,5,8,9,2,3};
     
     System.out.println(peak(nums));
     
    }
    static int peak(int arr[]){
              int start=0;
              int end=arr.length-1;
              while(start<=end){
                int mid=start + (end -start)/2;
                if(mid<arr.length-1 &&arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }
                else if(mid>start  &&arr[mid-1]>arr[mid]){
                    return arr[mid];
                }
              
                else if(arr[start]>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
              }
              return -1;
    }
  
}
