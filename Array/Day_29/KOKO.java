package Array.Day_29;

public class KOKO {
    public static void main(String[] args) {
        int arr[]={30,11,23,4,20};
         System.out.println(minEatingSpeed(arr, 5));
        
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start=1,end=findMax(piles);
        while(start<=end){
            int mid=start +( end-start)/2;
            int total=Calculate(piles, mid);
            if(total <=h){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;   
    }
     
    static int Calculate(int arr[],int hour){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil((double)arr[i]/(double)hour);
        }
  return total;
    }


    static int findMax(int arr[]){
        int a=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         a=Math.max(a, arr[i]);
        }
        
       return a;
    }
}
