package Recursion.Basic_Rec;

import java.util.ArrayList;

public class Liner_Search {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,3,5};
        System.out.println(Search(arr, 0, 5)); 
        System.out.println(find(arr, 0, 3));  
        System.out.println(FindLast(arr, 3, 1));
        System.out.println(FindAll(arr, 0, 3, new ArrayList<>()));
        System.out.println(FindAlls(arr, 0, 3));
    }
    static boolean Search(int arr[],int i,int target){
        if(i==arr.length){
            return false;
        }
        return target ==arr[i] || Search(arr, i+1, target);
    }
    // static int Ind(int arr[],int i,int target){
    //     if(i==target ){
    //         return -1;
    //     }
    static int find(int arr[],int i,int target){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return find(arr, i+1, target);
    }
    static int FindLast(int arr[],int i,int target){
        if(i==-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return FindLast(arr, i-1, target);
    }
    
    static ArrayList<Integer> FindAll(int arr[],int i,int target,ArrayList<Integer> str){
        if(i==arr.length){
            return str;
        }
        if(arr[i]==target){
            str.add(i);
        }
        return FindAll(arr, i+1, target, str);
    }

    static ArrayList<Integer> FindAlls(int arr[],int i,int target){
        ArrayList<Integer> str=new ArrayList<>();
        if(i==arr.length){
            return str;
        }
        if(arr[i]==target){
            str.add(i);
        }
        ArrayList<Integer> strs= FindAlls(arr, i+1, target);
        str.addAll(strs);

        return str;
    }
}
