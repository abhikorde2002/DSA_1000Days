package Array.Advance_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Array.Day_22.Collection;

public class Celebrity_Problem {
    public static void main(String[] args) {
        int arr[][]={{0,1,0},{0,0,0},{1,1,0}};
        System.out.println(celebrity(arr, 3));
    }

     static int celebrity(int M[][], int n)
    {
    	// code here 
    	int count=-1;
    	List<Integer> str= new LinkedList<>();
    	
    	for(int i=0;i<M.length;i++){
    	    for(int j=0;j<M[0].length;j++){
    	        if(M[i][j]==1){
    	            str.add(j);
    	        }
    	    }

    	}

        Collections.sort(str);
        System.out.println(str);
    	for(int i=0;i<str.size();i++){
            int a=str.get(i);
            int b=0;
            if(i<str.size()){
             b=str.get(i+1);
            }
    	    if(a==b){
    	        count++;
    	    }
    	}
        return count;
    }
}
