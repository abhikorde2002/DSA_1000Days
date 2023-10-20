package Array.Day_32;

public class Find_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,2};
        System.out.println(Sort(arr));
    }

    static int Sort(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int ind=arr[i]-1;
                if(arr[i]!=arr[ind]){
                    int tem=arr[i];
                    arr[i]=arr[ind];
                    arr[ind]=tem;
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
            
        }
        return -1;
    }
}
