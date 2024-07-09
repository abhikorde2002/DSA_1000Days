package Bineary_Tree;

import java.util.LinkedList;
import java.util.List;

public class Level_Order {
    public static void main(String[] args) {
     System.out.println(Math.abs(1-2)>1);
    }
    public class TreeNode {
             int val;
             TreeNode left;
            TreeNode right;
             TreeNode() {}
            TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
     List<List<Integer>> str= new LinkedList<List<Integer>>();
     public static void method(){
        List<List<Integer>> str= new LinkedList<List<Integer>>();
        str.reversed();
     }
    //      private static  TreeNode Coneverting(int arr[]){
    //         TreeNode head=new TreeNode(arr[0]);
    //         TreeNode prev=head;
    
    //         for(int i=1;i<arr.length;i++){
    //           TreeNode tem= new TreeNode(arr[i], null, prev);
    //           prev.next=tem;
        
    //           prev=tem; 
    // }   
    //         return head;
    // } 
}
