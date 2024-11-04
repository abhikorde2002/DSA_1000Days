package Complet_Binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorder_traversale {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(2);
        tree.right.left= new TreeNode(4);
        tree.right.right= new TreeNode(5);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
     //   System.out.println(preorderTraversal(tree));
        System.out.println(preOrder(tree));
    }

    static List<Integer> preOrder(TreeNode root){
        List<Integer> str= new ArrayList<>();
        List<List<Integer>> s = new ArrayList<>();
        preTraversal(str,root,s);
        System.out.println(s);
        return str;
    }

    static void preTraversal(List<Integer> str,TreeNode root,List<List<Integer>> s){
        if(root==null){ s.add(str);
            System.out.println(s);
         return;
        }
         
        str.add(root.val);
        preTraversal(str,root.left,s);
        preTraversal(str,root.right,s);
    }

   public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> str= new ArrayList<>();
        if(root==null) return str;
        Stack<TreeNode> s= new Stack<>();
        s.push(root);
        int sum=0;
        while(!s.isEmpty()){
            root=s.pop();
            str.add(root.val);
            
            if(root.right!=null){
                s.add(root.right);
            }
            if(root.left!=null){
                s.add(root.left);
               
            }
        }

        return str;
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}