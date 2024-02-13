package Array.Day_32;

public class Capacity_ship {
    public static void main(String[] args) {
        int arr[]={3,2,2,4,1,4};
        System.out.println(Days(arr, 3));
    }

    static int Days(int arr[],int d){
        int min=Integer.MAX_VALUE,max=0, sum=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            sum+=arr[i];
        }
        max=sum;
        int start=min;
        int end=max;
        int ans=Integer.MAX_VALUE;
        while (start<=end) {
             int mid= start+ (end-start)/2;
             int total=posible(arr, mid);
          
             if(total<=d){
                end=mid-1;
                if(mid<ans){
                    ans=mid;
                }
             }
             else{
                start=mid+1;
             }
        }
        return ans;
    }

    static int posible(int arr[],int mid){
        int ans= 1;
        int total=0;
        for(int i=0;i<arr.length;){
             total+=arr[i];
            if(total>mid){
              ans++;
              total=0;
            }   
            else{
                i++;
            } 
        }
        return ans;
    }
}
