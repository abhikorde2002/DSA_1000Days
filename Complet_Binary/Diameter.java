package Complet_Binary;

public class Diameter {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        System.out.println(diameterOfBinaryTree(tree));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int arr[]= new int[1];
       check(root,arr);
       return arr[0];
    }

    public static int check(TreeNode root , int max[]){
      if(root==null) return 0;

      int lef=check(root.left,max);
      int rig=check(root.right,max);

      max[0]=Math.max(max[0],lef+rig);
      return 1+Math.max(lef,rig);
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
