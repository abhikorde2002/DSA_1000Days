package Greed;

public class jump_Game_2 {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        //System.out.println(Game(arr));
        System.out.println(Games(arr));
    }
    static int Games(int arr[]){
        int jump=0;
        for (int i = 0; i < arr.length-1; ) {
            int val=arr[i];
            int max=0;
            int ind=0;
            int index=i+1;
            if(i==arr.length-1){
                break;
            }
            for (int j = 0; j < val; j++) {
                if(index<arr.length){
                if(max<arr[index] ){
                    ind=index;
                    max=arr[index++];
                }
                else{
                    index++;
                }}
            }
            i=ind;
            jump++;
        }
        return jump;
    }

    static int Game(int arr[]){
        int left=0;
        int right=0;
        int max=0;
        int jump=0;
        int ind=0;
        while (right<arr.length-1) {
            max=0;
            for(int i=left;i<arr[left];i++){
             max=Math.max(max, i+arr[i]);
            }
            jump++;
            left=right+1;
            right=max;
        }
        return jump;
    }
}
