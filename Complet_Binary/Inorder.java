package Complet_Binary;
import java.util.*;;
public class Inorder {
    public static void main(String[] args) {
        int v=10;
        if(v==10){
System.out.println();
        }
        else if(v==10){
            System.out.println();
        }
        if (v==10) {
            System.out.println("Hello");
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> str= new ArrayList<>();
          if(root==null) return str;
          Stack<TreeNode> s= new Stack<TreeNode>();
          TreeNode node=root;
          while(true){
              if(node!=null){
                  s.push(node);
                  node=node.left;
              }
              else{
                  if(s.isEmpty())break;
                  node=s.pop();
                  str.add(node.val);
                  node=node.right;
              }
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