package Complet_Binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;


class Pair{
    int ind;
    TreeNode node;
    Pair(TreeNode node,int ind){
        this.ind=ind;
        this.node=node;
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

public class Right_side {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        Queue<TreeNode> s= new LinkedList<>();
       preorder(tree, 0, s);
       List<Integer> list= new ArrayList<>();
       while(!s.isEmpty()){
        TreeNode n=s.remove();
           list.add(n.val);
       }
       System.out.println(list);
       // tree.right= new TreeNode(3);
        // tree.right.left=new TreeNode(6);
        // tree.right.right=new TreeNode(7);
        // tree.left.left= new TreeNode(4);
        // tree.left.right= new TreeNode(5);
        // tree.left.right.left=new TreeNode(8);
        // tree.left.right.right= new TreeNode(9);
      //  System.out.println(rightSideView(tree));
    }

    static void preorder(TreeNode root,int ind,Queue<TreeNode> s){
        if(root==null)return;

        if(ind==s.size()) s.add(root);
        preorder(root.right, ind+1, s);
        preorder(root.left, ind+1, s);
    }
    //  public static List<Integer> rightSideView(TreeNode node) {
    //      List<Integer> s= new ArrayList<>();
    //     if(node==null){
    //       return s;
    //     }
    //     Map<Integer,Integer> map= new TreeMap<>();
    //     Queue<Pair> queue= new LinkedList<>();
    //     queue.add(new Pair(node, 0));
       
    //   if(node.right!=null){
    //       while(!queue.isEmpty()) {
    //         Pair pair = queue.remove();
    //         int ind=pair.ind;
    //         TreeNode root= pair.node;
    //         if(!map.containsKey(ind)){
    //             map.put(ind, root.val);
    //         }

    //         // if(root.left!=null){
    //         //     queue.add(new Pair(root.left, ind-1));
    //         // }
    //         if(root.right!=null){
    //             queue.add(new Pair(root.right, ind+1));
    //         }
    //     }
    //   }
    //   else if(node.right==null){
    //       while(!queue.isEmpty()) {
    //         Pair pair = queue.remove();
    //         int ind=pair.ind;
    //         TreeNode root= pair.node;
    //         if(!map.containsKey(ind)){
    //             map.put(ind, root.val);
    //         }

    //         if(root.left!=null){
    //             queue.add(new Pair(root.left, ind-1));
    //         }
    //         // if(root.right!=null){
    //         //     queue.add(new Pair(root.right, ind+1));
    //         // }
    //     }
    //   }
    //     for(Map.Entry<Integer,Integer> m: map.entrySet()){
    //         s.add(m.getValue());
    //     }
    //     if(node.right==null){    
    //         Collections.reverse(s);
    //     }
    //     return s;
    // }
}
