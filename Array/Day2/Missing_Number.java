package Array.Day2;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={0,1,3};
        Missing(arr);
    }

    static void Missing(int arr[]){
      int sum=0;
        int size=arr.length;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println((size * (size+1))/2 -sum);
    }
    }

