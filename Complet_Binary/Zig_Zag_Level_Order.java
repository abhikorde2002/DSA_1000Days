package Complet_Binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zig_Zag_Level_Order {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
      //  System.out.println(zigzagLevelOrder(tree));
      System.out.println(zig_zag(tree));
    }

    static List<List<Integer>> zig_zag(TreeNode node){
        List<List<Integer>> list= new ArrayList<>();
        if(node==null)return list;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(node);
        int count=1;
        while (!queue.isEmpty()) {
            List<Integer> lis= new ArrayList<>();
            int size=queue.size();
            for (int i = 0; i <size; i++) {
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                 lis.add(queue.remove().val);
            }
           if(count%2==0){
               list.add(lis.reversed());
            }
            else {
                list.add(lis);
            }
            count++;
        }
        return list;
    }

    static  List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null) {
            return list;
        }
        Queue<TreeNode> queue= new LinkedList<>();

        queue.add(root);
        int level=1;
        while (!queue.isEmpty()) {
            List<Integer> li= new ArrayList<>();

            int size= queue.size();
            for(int i=0;i<size;i++){
            if (queue.peek().left!=null) {
                queue.add(queue.peek().left);
            }
            if (queue.peek().right!=null) {
                queue.add(queue.peek().right);
            }
            li.add(queue.remove().val);
        }
          if (level%2==0) {
            list.add(li.reversed());
          }
          else{
            list.add(li);
          }
          level++;
        }
        return list;
    }
}
