package Complet_Binary;

import java.util.ArrayList;
import java.util.HashMap;
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
public class Top_View {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
         System.out.println(top_view(tree));
    }

    static List<Integer> top_view(TreeNode node){
        List<Integer> s= new ArrayList<>();
        if(node==null){
          return s;
        }
        Map<Integer,Integer> map= new TreeMap<>();
        Queue<Pair> queue= new LinkedList<>();
        queue.add(new Pair(node, 0));
       
        while(!queue.isEmpty()) {
            Pair pair = queue.remove();
            int ind=pair.ind;
            TreeNode root= pair.node;
            if(!map.containsKey(ind)){
                map.put(ind, root.val);
            }

            if(root.left!=null){
                queue.add(new Pair(root.left, ind-1));
            }
            if(root.right!=null){
                queue.add(new Pair(root.right, ind+1));
            }
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            s.add(m.getValue());
        }
       
        return s;
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