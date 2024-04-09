package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Astronid_Collision {
    public static void main(String[] args) {
        int arr[]={5,10,-5};
        //1,-2,10,-5
        //-4, 6
       System.out.println(Arrays.toString(Collision(arr)));  
    } 

     public static int[] Collision(int[] arr) {
        Stack<Integer> s= new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(!s.isEmpty() && arr[i]<0 && s.peek()>0){
                if(Math.abs(s.peek())<Math.abs(arr[i])){
                     s.pop();
                     i--;
                }
                else if(Math.abs(s.peek())==Math.abs(arr[i])){
                    s.pop();
                }
            }
            else{ 
                s.push(arr[i]);
            }
        }
        int ans[]= new int[s.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=s.pop();
        }
        return ans;
    }
}
