package Complet_Binary;

public class Max_Path_Sum {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        System.out.println(maxPathSum(tree));
    }

    static int maxPathSum(TreeNode root) {
        int max[]= new int[1];
        check(root, max);
        return max[0];
    }

    public static int check(TreeNode root , int max[]){
        if(root ==null)return 0;

        int left= check(root.left, max);
        int right= check(root.right, max);
        max[0]= Math.max(max[0], left+right+root.val);

        return root.val + Math.max(left, right);
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