package Array.Day8;

public class Smallest_subarray {
    public static void main(String[] args) {
       int A[] = {1, 4, 45, 6, 0, 19};
       System.out.println(smallestSubWithSum(A, 6, 51));
    }

     public static int smallestSubWithSum(int a[], int n, int x) {
              int Cuu_sum=0;
              int start=0;
              int ans=Integer.MAX_VALUE;
              for(int i=0;i<n;i++){
                Cuu_sum+=a[i];
                while(Cuu_sum>x){
                 ans=Math.min(ans, i-start+1);
                 Cuu_sum-=a[start++];
                }
                
              }
              return ans!=Integer.MAX_VALUE?ans:0;
     }

}
