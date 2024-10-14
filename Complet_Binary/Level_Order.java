package Complet_Binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Level_Order {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        System.out.println(levelOrder(tree));
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> str= new ArrayList<>();
        Queue<TreeNode> s= new LinkedList<>();
        if(root==null)return str;
        s.add(root);
        
        while (!s.isEmpty()) {
            int size=s.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<size;i++){
            if(s.peek().left!=null) s.add(s.peek().left);
            if (s.peek().right!=null) {
                s.add(s.peek().right);
            }
            list.add(s.remove().val);
        }
        str.add(list);
        }
       return str;
    }
}
