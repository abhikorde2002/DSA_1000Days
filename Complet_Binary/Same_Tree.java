package Complet_Binary;

public class Same_Tree {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1);
        tree.left=new TreeNode(2);
        tree.right= new TreeNode(3);
        tree.left.left= new TreeNode(4);
        tree.left.right= new TreeNode(5);
        TreeNode tre=new TreeNode(1);
        tre.left=new TreeNode(2);
        tre.right= new TreeNode(3);
        tre.left.left= new TreeNode(4);
        tre.left.right= new TreeNode(7);
        System.out.println(isSameTree(tree, tre));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
       
       return (p!=null && q!=null) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && (p.val==q.val);
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

