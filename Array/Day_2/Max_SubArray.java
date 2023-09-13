package Array.Day_2;
//Kadanes algorithm
public class Max_SubArray {
    public static void main(String[] args) {
        int num[]={-2,-3,-1,2,5,4};
        kadanes(num);
    }

    static void kadanes(int arr[]){
        int mx=Integer.MIN_VALUE;
        int curount=0;

        for(int i=0;i<arr.length;i++){
           curount+=arr[i];
           if(curount<0){
            curount=0;
           }
           mx=Math.max(curount, mx);
        }
        System.out.println(mx);
    }
}
