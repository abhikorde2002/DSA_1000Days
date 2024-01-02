package LeetCode_Contest.Array;

public class Bit_Traling_Zero {
    public static void main(String[] args) {
        
         int arr[]={1,3,5,7,9};
         System.out.println(isTrailing(arr));
        // for(int i=0;i<arr.length;i++){
            
        //     if(i<arr.length ){
        //    int a=decimal(arr[i]);
        //    int b=decimal(arr[i+1]);
        //    if(a | b){

        //    }
        //     }
        // }
      
    }

    static boolean isTrailing(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2==0 && arr[j]%2==0){
                    return true;
                }
            }
        }
        return false;
    }
}
