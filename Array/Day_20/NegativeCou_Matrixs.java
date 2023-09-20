package Array.Day_20;

public class NegativeCou_Matrixs {
    public static void main(String[] args) {
     int arr[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
     System.out.println(counts(arr));   
    }
  

   static int counts(int arr[][]){
    int start=0;
    int end=arr[0].length-1;
    int count=0;
    while(start<arr.length && end>=0){
     //   int mid=start + (end-start)/2;
        if(arr[start][end]<0){
           count+=arr.length-start;
           end--;
        }
        else {
               start++;
        }
    }

return count;
   }
}
