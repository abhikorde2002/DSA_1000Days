package Array.Day_29;

public class MIN_N_Day {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,12,7,7};
        // int arr[]={1,10,3,10,2};
        // System.out.println(Bouquets(arr, 3, 2));
        System.out.println(flowers(arr, 2, 3));
    }
    static boolean posible(int arr[],int day,int m,int k){
        int total=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                total+=(count/k);
                count=0;
            }
        }
        total+=count/k;
        return total==m ? true : false;
    }

    static int flowers(int arr[],int m,int k ){
        long val=(long) m*k;
        int n=arr.length;
        if(val> n){ return -1;}
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max, arr[i]);
        }
        int start=min;
        int end=max;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            boolean total=posible(arr, mid, m, k);
            if(total==true){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    
    public int minDays(int[] arr, int m, int k) {
        long val = (long) m * k;
       int n = arr.length; // Size of the array
       if (val > n) return -1; // Impossible case.
       // Find maximum and minimum:
       int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
       for (int i = 0; i < n; i++) {
           mini = Math.min(mini, arr[i]);
           maxi = Math.max(maxi, arr[i]);
       }
       // Apply binary search:
       int low = mini, high = maxi;
       while (low <= high) {
           int mid = (low + high) / 2;
           if (possible(arr, mid, m, k)) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       return low;
   }

    public static boolean possible(int[] arr, int day, int m, int k) {
       int n = arr.length; // Size of the array
       int cnt = 0;
       int noOfB = 0;
       // Count the number of bouquets:
       for (int i = 0; i < n; i++) {
           if (arr[i] <= day) {
               cnt++;
           } else {
               noOfB += (cnt / k);
               cnt = 0;
           }
       }
       noOfB += (cnt / k);
       return noOfB >= m;
    }
    /*
    static int Bouquets(int arr[],int k,int m){
       int count=0, h=0;
       int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){  
            for(int j=0;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    count++;
                }
                if(count==k){
                   count=0;
                   h++;
                }
                else if(arr[i]<=arr[j]){
                    count=0;
                    continue;
                }
            }
            // System.out.println(h);
        if(h==m){
             ans=Math.min(ans, arr[i]);
        }
        }

       return ans;
    }
     */
}
