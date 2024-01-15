package Array.Advance_Array;

public class Sum_both_side {
    public static void main(String[] args) {
       int arr[]= {448, 200, 458, -382, -420, 796, -202, 281, 589, -202, -991, 157, -528, 622, -462, -708, -962, -821, -810, 657, 958, -809, 815};
       System.out.println(Sum(arr, 3)); 
    }

    static int Sum(int arr[],int b){
        int ans=0;
        int start=0;
        int end= arr.length-1;
         for(int i=0;i<b;i++){
             ans+=arr[i];
             start=i;
         }
         int sum=ans;
         start =b-1;
         while (start>=0 && end>=0) {
            sum-=arr[start--];
            sum+=arr[end--];
            ans=Math.max(sum,ans);
         }
         return ans;
    }
}
