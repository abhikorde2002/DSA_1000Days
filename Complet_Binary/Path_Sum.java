package Complet_Binary;

public class Path_Sum {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        System.out.println(hasPathSum(tree, 22));
    }

    public static boolean hasPathSum(TreeNode root, int target) {
        if(root==null) return false;
        
        if(root.left==null && root.right==null) return target==root.val;
        boolean left=hasPathSum(root.left, target-root.val);
        boolean right= hasPathSum(root.right, target-root.val);

        return left || right;
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