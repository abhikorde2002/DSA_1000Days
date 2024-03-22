package Stack_Queue.Que;

import java.util.Arrays;

public class Game_Twostack {
    public static void main(String[] args) {
        // System.out.println("Hello");
        int arr[]={4,2,4,6,1};
        int sum[]={2,1,8,5};
        System.out.println(twoStack(arr,sum,10));
        
    }

    static int twoStack(int arr[],int num[],int x){
        return two(arr,num,x,0,0)-1;
    }
    static int two(int arr[],int sum[],int x,int cou,int total ){
        if(total>x){
            return cou;
        }

        if (arr.length==0 || sum.length==0) {
            return cou;
        }
        int ans=two(Arrays.copyOfRange(arr,1,arr.length)   , sum, x, cou+1, total+arr[0]);

        int s= two(arr,Arrays.copyOfRange(sum,1,sum.length),x,cou+1,total+sum[0]);

        return Math.max(ans, s);
    }

}
