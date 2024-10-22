package Complet_Binary;
import java.util.*;
public class Postorder_traversale {
   public static void main(String[] args) {
    
    TreeNode tree=new TreeNode(1);
    tree.left=new TreeNode(2);
    tree.right= new TreeNode(3);
    tree.left.left= new TreeNode(4);
    tree.left.right= new TreeNode(5);
   System.out.println( postorderTraversal(tree));
   } 
   static List<Integer> postorderTraversal(TreeNode root) {
     Stack<TreeNode> stack= new Stack<>();
     Stack<TreeNode> s= new Stack<>();
     List<Integer> list= new ArrayList<>();
     if(root==null)return list;
     stack.add(root);

     while (!stack.isEmpty()) {
        root=stack.pop();
        s.add(root);
        if(root.left!=null)stack.add(root.left);
        if(root.right!=null)stack.add(root.right);
     }
     
     while (!s.isEmpty()) {
        list.add(s.pop().val);
     }
     return list;
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
