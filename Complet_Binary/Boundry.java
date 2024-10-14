package Complet_Binary;
import java.util.*;
public class Boundry {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(7);
        tree.left.left= new TreeNode(3);
        tree.left.left.right= new TreeNode(4);
        tree.left.left.right.left= new TreeNode(5);
        tree.left.left.right.right= new TreeNode(6);
        tree.right.right=new TreeNode(8);
        tree.right.right.left=new TreeNode(9);
        tree.right.right.left.left=new TreeNode(10);
        tree.right.right.left.right=new TreeNode(11);
        System.out.println(Answer(tree));
    }

    static List<Integer> Answer(TreeNode node){
        ArrayList<Integer> list= new ArrayList<>();
        if(node==null)return list;

        ArrayList<Integer> ans= new ArrayList<>();
        left_node(node, list);
        inorder(node, list);
        right_node(node, list, ans);
        return list;

    }
    static void right_node(TreeNode root , ArrayList<Integer> list,ArrayList<Integer> s){
       TreeNode node=root.right;
        while (node!=null) {
            if(node.left!=null || node.right!=null) s.add(node.val);
            if (node.right!=null) {
                node=node.right;
            }
            else node=node.left;
        }

        int size=s.size();
        for (int i = size-1; i >=0; i--) {
             list.add(s.get(i));
        }
    }
    static void inorder(TreeNode root , ArrayList<Integer> list){
        if (root==null) {     
            return;
        }
        if(root.left!=null)inorder(root.left, list);
        if(root.left==null && root.right==null)list.add(root.val);
        if(root.right!=null)inorder(root.right, list);
    }

    static void left_node(TreeNode node , ArrayList<Integer> list){
        list.add(node.val);
        TreeNode root=node.left;
        while (root!=null) {
            if(root.left!=null || root.right!=null) list.add(root.val);
            if (root.left!=null) {
                root=root.left;
            }
            else root=root.right;
        }
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
