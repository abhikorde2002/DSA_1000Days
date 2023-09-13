package Array.Day_1;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[]={2,7,3,5};
        sum(arr, 9);
    }

    static void sum(int arr[],int target){
        int num[]= new int[2];
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]+arr[j]==target){
                num[0]=i;
                num[1]=j;
              }
          }
        }
         for (int i : num) {
        System.out.println(i);
       }}
    }

