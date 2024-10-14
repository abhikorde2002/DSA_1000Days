package Complet_Binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Symmetrice {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(2);
        tree.right.left= new TreeNode(4);
        tree.right.right= new TreeNode(5);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        
        System.out.println(isSymmetric(tree));
    }

    public static boolean isSymmetric(TreeNode root) {
         Stack<TreeNode> s= new Stack<>();
         Stack<TreeNode> stack= new Stack<>();
         TreeNode node=root;
         if(root==null)return true;
         if(root.left!=null && root.right!=null){
         s.add(root.left);
         stack.add(node.right);
         }
         else{
            return false;
         }
        
         while (true) {
            if(node!=null && root!=null){
                s.add(node);
                stack.add(root);
                if(s.peek().val!=stack.peek().val){
                    return false;
                }
                node=node.right;
                root=root.left;
               
            }
            else if( (node==null && root!=null) || (root==null && node==null)) {
                return false;
            }
            else{
                if(!s.isEmpty() || !stack.isEmpty())break;
                root=s.pop();
                node=stack.pop();
                if(s.peek().val!=stack.peek().val){
                    return false;
                }
                 root=root.right;
                node=node.left;
            }
         } 
            return true;
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