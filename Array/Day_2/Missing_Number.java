package Array.Day_2;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={0,1,3};
        Missing(arr);
        missing(arr);
    }

    static void Missing(int arr[]){
      int sum=0;
        int size=arr.length;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println((size * (size+1))/2 -sum);
    }

    static void missing(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count!= arr[i]){
               System.out.println(count);
            }
            count++;
        }
    }
    }

