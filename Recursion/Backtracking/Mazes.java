package Recursion.Backtracking;

import java.util.Arrays;

public class Mazes {
    public static void main(String[] args) {
        
        boolean arr[][]={{true,true,true},{true,true,true},{true,true,true}};
        int sum[][]={{0,0,0},{0,0,0},{0,0,0}};
       // Back("", arr, 0, 0);
       Maze("", arr, 0, 0, sum, 1);
    }
    static void Maze(String s,boolean arr[][],int r,int c ,int sum[][],int steps){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(s);
            for(int a[]:sum){
                System.out.println(Arrays.toString(a));
            }
            //System.out.println(Arrays.toString(sum));
            return;
        }
        
        if(!arr[r][c]){
            return;
          }
          arr[r][c]=false;
          sum[r][c]=steps;
        if(r<arr.length-1){
            Maze(s+"D", arr, r+1, c,sum,steps+1);
        }
        if(c<arr[0].length-1){
            Maze(s+"R", arr, r, c+1,sum,steps+1);
        }
        if(r>0){
            Maze(s+"U", arr, r-1, c,sum,steps+1);
        }
        if(c>0){
            Maze(s+"L", arr, r, c-1,sum,steps+1);
        }
        arr[r][c]=true;
        sum[r][c]=0;
    }

    static void Back(String s,boolean arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(s);
            return;
        }
        
        if(!arr[r][c]){
            return;
          }
          arr[r][c]=false;
        if(r<arr.length-1){
            Back(s+"D", arr, r+1, c);
        }
        if(c<arr[0].length-1){
            Back(s+"R", arr, r, c+1);
        }
        if(r>0){
            Back(s+"U", arr, r-1, c);
        }
        if(c>0){
            Back(s+"L", arr, r, c-1);
        }
        arr[r][c]=true;
    }
}
