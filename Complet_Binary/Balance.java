package Complet_Binary;

public class Balance {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
    tree.left=new TreeNode(2);
    tree.right= new TreeNode(3);
    tree.left.left= new TreeNode(4);
    tree.left.right= new TreeNode(5);
    System.out.println(isBalanced(tree));
    }

    static boolean isBalanced(TreeNode root) {
         return check(root)!=-1;
    }

    static int check(TreeNode node){
        if (node==null) {
            return 0;
        }
        int left=check(node.left);
        int right=check(node.right);
        if (left==-1 || right==-1) {
            return -1;
        }
        if (Math.abs(right-left)>1) {
            return -1;
        }

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