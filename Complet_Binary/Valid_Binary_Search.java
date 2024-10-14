package Complet_Binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Valid_Binary_Search {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(4);
        tree.left=new TreeNode(1);
        tree.left.left=new TreeNode(0);
        tree.left.right=new TreeNode(2);
        tree.right=new TreeNode(5);


        System.out.println(isValidBST(tree));
        System.out.println(isValidBSTs(tree));
    }

    public static boolean  isValidBSTs(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        TreeNode prev = null;  // This will store the previously visited node in the in-order traversal

        while (currentNode != null || !stack.isEmpty()) {
            // Traverse the left subtree
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            // Process the current node
            currentNode = stack.pop();
            System.out.println(currentNode.val);
            // Check if the current node's value is greater than the previous value (in-order property)
            if (prev != null && currentNode.val <= prev.val) {
                return false;
            }
            prev = currentNode;  // Update the previous node
            System.out.println(prev.val);
            // Traverse the right subtree
            currentNode = currentNode.right;
        }

        return true;  // If no violations found, it's a valid BST
    }
    public static  boolean isValidBST(TreeNode root) {
         List<Integer> str= new ArrayList<>();
        if(root==null) return true;
        Stack<TreeNode> s= new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            root=s.peek();
            str.add(root.val);
            TreeNode ri=s.peek().right;
            TreeNode le=s.peek().left;
            s.pop();
            if(root.right!=null && root.val>ri.val){
               return false;
            }
            else if(root.right!=null){
                s.add(root.right);
            }
            if(root.left!=null  && root.val<le.val){  
                return false;
               
            }
            else if(root.left!=null ) {
                s.add(root.left);
            }
        }
       System.out.println(str);
        return true;
    }
    }


