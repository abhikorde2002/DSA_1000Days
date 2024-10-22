package Complet_Binary;
import java.util.*;;
public class Inorder {
    public static void main(String[] args) {
    TreeNode tree=new TreeNode(1);
    tree.left=new TreeNode(2);
    tree.right= new TreeNode(3);
    tree.left.left= new TreeNode(4);
    tree.left.right= new TreeNode(5);
    tree.right.left=new TreeNode(6);
    tree.right.right= new TreeNode(7);
    System.out.println(Inorder(tree));
    System.out.println(levelOrder(tree));
    }
    
    static List<Integer> Inorder(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list= new ArrayList<>();
        if(node==null)return list;

        queue.add(node);
        while(!queue.isEmpty()) {
            node=queue.remove();
            list.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null)queue.add(node.right);

        }
       return list;
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> s= new LinkedList<TreeNode>();
         List<List<Integer>> str= new LinkedList<List<Integer>>();
        if(root==null)return str;
        s.offer(root);
        while(!s.isEmpty()){
            int size=s.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<size;i++){
                if(s.peek().left!=null) s.offer(s.peek().left);
                if(s.peek().right!=null) s.offer(s.peek().right);
                list.add(s.poll().val);
            }
            str.add(list);
        }
        return str; 
    }
}

 class TreeNode {
        int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }