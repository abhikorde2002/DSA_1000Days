package Sliding_Two_Pointer;


//Maximum Points You Can Obtain from Cards
public class Max_Point {
    public static void main(String[] args) {
        int arr[]={2,2,2};
        System.out.println(Cards(arr, 2));
    }

    //O(2*k)
    static int Cards(int arr[],int k){
        int sum=0,left=0,right=arr.length-1;
         int max= Integer.MIN_VALUE;
        for (int i = 0; i <=k-1; i++) {
            sum+=arr[i];
           
        }
        max=sum;
        for (int i = k-1; i >=0 ; i--) {
            sum-=arr[i];
            sum+=arr[right--];
            max=Math.max(max, sum);
        }

        return max;
    }
}
