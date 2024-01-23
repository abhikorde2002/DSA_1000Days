package Array.Advance_Array;

public class Count_Inversion {
    public static void main(String[] args) {
      int arr[]={2, 3, 4, 5, 6};
      long ab[]={2, 4, 1, 3, 5};
     // System.out.println(missingNumber(arr)); 
      System.out.println(inversionCount(ab, 5)); 
    }

    public static int missingNumber(int[] arr) {
        int i=0;
        int cou=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]<arr.length &&arr[i]!=arr[index]){
                int tem=arr[i];
                arr[i]=arr[index];
                arr[index]=tem;
                cou++;
            }
            else{
                i++;
            }
           }
           return cou;
     
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long cou=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i+1;j++){
                if(j<arr.length-1 && arr[j]>arr[j+1]){
                    long tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    cou++;
                }
            }
        }
        return cou;
    }
}
