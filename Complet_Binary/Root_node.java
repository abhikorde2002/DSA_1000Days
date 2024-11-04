package Complet_Binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Root_node {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        System.out.println(root(tree, 5));
        System.out.println(Root_Path(tree));
    }

    static List<List<Integer>> Root_Path(TreeNode node){
        List<List<Integer>> str = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        find_path(node, str, list);
        return str;
    }

    static void find_path(TreeNode node, List<List<Integer>> arr,List<Integer> list){
        if(node==null)return;

        list.add(node.val);
        if(node.left==null && node.right==null)arr.add(new ArrayList<>(list));
        else{ find_path(node.left, arr, list);
            find_path(node.right, arr, list);
        }

        list.remove(list.size()-1);
    }

    static List<Integer> root(TreeNode node,int ans){
        List<Integer> str= new ArrayList<>();
      
        if(node==null)return str;
        find_node(node, str, ans);
    
        return str;
    }
    static boolean find_node(TreeNode node,List<Integer> str,int x){
        if(node==null){ 
            return false;
        }
        str.add(node.val);
        if(node.val==x)return true;
        if(find_node(node.left, str, x)|| find_node(node.right, str, x))return true;
          str.remove(str.size()-1);
        
        return false;
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