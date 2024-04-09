package Sliding_Two_Pointer;

public class Max_Sum_Subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Max_Sum(arr, 3));
    }

    static int Max_Sum(int arr[],int k){
        if(arr.length<k) return -1;
        int l=0,r=k-1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = l; i <=r; i++) {
            sum+=arr[i];
        }
        while (r<arr.length-1) {
            
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            max=Math.max(max,sum);
        }
        return max;
    }
}
