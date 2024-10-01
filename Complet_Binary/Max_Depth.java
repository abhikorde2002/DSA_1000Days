package Complet_Binary;

public class Max_Depth {
   public static void main(String[] args) {
    TreeNode tree=new TreeNode(1);
    tree.left=new TreeNode(2);
    tree.right= new TreeNode(3);
    tree.left.left= new TreeNode(4);
    tree.left.right= new TreeNode(5);
    System.out.println(maxDepth(tree));
   }
   
   static int maxDepth(TreeNode root) {
     if (root==null) {
        return 0;
     }

     int left= maxDepth(root.left);
     int right= maxDepth(root.right);

     return 1+Math.max(left, right);

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