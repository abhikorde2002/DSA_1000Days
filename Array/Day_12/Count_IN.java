package Array.Day_12;

public class Count_IN {
    public static void main(String[] args) {
        long arr[]={2,4,1,3,5};
        System.out.println(inversionCount(arr, 5));
        System.out.println(interval(arr, 5));
    }

    static long inversionCount(long arr[], long N)
    { 
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i] > arr[j] ){
                count++;
            }
            }
        }
        return count;
}

    static long interval(long arr[],long N){
        int count=0;
        int i=0,j=i+1;
        while(i<N && j<N){
            if(arr[i]>arr[j]){count++;
                 j++;
            }else{
            i++;
            }
        }
        return count;
    }
      
}

