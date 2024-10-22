package Complet_Binary;

import java.util.ArrayList;

import java.util.LinkedList;
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

public class Bottom_view {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.right.left=new TreeNode(6);
        tree.right.right=new TreeNode(7);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        tree.left.right.left=new TreeNode(8);
        tree.left.right.right= new TreeNode(9);
        System.out.println(bottom_view(tree));
    }

    static ArrayList<Integer> bottom_view(TreeNode node){
        ArrayList<Integer> str= new ArrayList<>();
        if(node==null)return str;

        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(node, 0));
 
        while(!q.isEmpty()){
            Pair p =q.remove();
            int ind= p.ind;
            TreeNode root=p.node;

             if(!map.containsKey(ind)){
                map.put(ind,root.val);
             }
             else if(map.containsKey(ind)){
                map.replace(ind, root.val);
             }
             if(root.left!=null){
                q.add(new Pair(root.left, ind-1));
             }
             if(root.right!=null){
                q.add(new Pair(root.right, ind+1));
             }
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
              str.add(m.getValue());
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