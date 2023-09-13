package Array.Day_11;

public class Smallest_Letter {
    public static void main(String[] args) {
        char ch[]={'c','f','j'};
        System.out.println(smallest(ch, 'j'));
    }

    static char smallest(char arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>= arr[start])start=mid+1;
            else if(target <= arr[end]) end = mid-1;
        }
        return arr[start%arr.length];
    }
}
