package Array.Day2;

public class Max_sub {
    public static void main(String[] args) {
       int arr[]={-2,-1,1,3,4,5}; 
      sub(arr);
    }

    static void sub(int arr[]){
       int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
           max=Math.max(sum,max); 
          
            if (sum<0)  sum=0;
        }
        
        System.out.println(max);
    }
}
