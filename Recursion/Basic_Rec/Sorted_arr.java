package Recursion.Basic_Rec;

public class Sorted_arr {
    public static void main(String[] args) {
    int arr[]={1,2,3,5};
    System.out.println(status(arr, 0)); 
    System.out.println(Search(arr, 0, 5)); 
    System.out.println(find(arr, 0, 3));  
    System.out.println(FindLast(arr, 3, 1));
    }
    static boolean  status(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        
        return arr[i]<arr[i+1] && status(arr, i+1);
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
    // }
}
