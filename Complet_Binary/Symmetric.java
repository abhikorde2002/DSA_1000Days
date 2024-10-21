package Complet_Binary;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Symmetric {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(2);
      //  tree.right.left= new TreeNode(4);
        tree.right.right= new TreeNode(4);
       // tree.left.left= new TreeNode(5);
        tree.left.right= new TreeNode(4);
        System.out.println(rightSideView(tree));
    }

    public static boolean rightSideView(TreeNode node) {
          Queue<TreeNode> s= new LinkedList<>();
        
          s.add(node.left);
          s.add(node.right);
        while(!s.isEmpty() ) {
        TreeNode left= s.poll();
        TreeNode rig= s.poll();

        if(left==null && rig==null)continue;
        if(left==null || rig==null)return false;
        if(left.val!=rig.val)return false;
        s.add(left.left);
        s.add(rig.right);

        s.add(left.right);
        s.add(rig.left);
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