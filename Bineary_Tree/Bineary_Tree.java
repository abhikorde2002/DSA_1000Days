package Bineary_Tree;

import java.util.Scanner;

public class Bineary_Tree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Bineary_Tree tree= new Bineary_Tree();
        tree.populate(sc);
        tree.prettyDisplay();
        tree.preOrder();
    }

    public Bineary_Tree(){

    }
    public static class Node{
        int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
    }
    }
    private Node root;
    public  void populate(Scanner scanner){
        System.out.println("Enter val:- ");
       int val=scanner.nextInt();
       root=new Node(val);
       populate(scanner,root);
    }

    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to insert left of :- " + node.value);
        boolean val=sc.nextBoolean();
        if(val){
            System.out.println("Enter the val of left:- "+node.value);
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to insert right of :- " + node.value);  
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the val of left:- "+node.value);
            int value=sc.nextInt();
            node.right=new Node(value);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(this.root, " ");
    }
    private void display(Node node, String indent) {
        if (node == null) {
          return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
      }
      public void prettyDisplay() {
        prettyDisplay(root, 0);
      }
    
      private void prettyDisplay(Node node, int level) {
        if (node == null) {
          return;
        }
    
        prettyDisplay(node.right, level + 1);
    
        if (level != 0) {
          for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t\t");
          }
          System.out.println("|------->" + node.value);
        } else {
          System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
      }
      public void preOrder() {
        preOrder(root);
      }
    
      private void preOrder(Node node) {
        if (node == null) {
          return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
      }
    
      public void inOrder() {
        preOrder(root);
      }
    
      private void inOrder(Node node) {
        if (node == null) {
          return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
      }
    
      public void postOrder() {
        preOrder(root);
      }
    
      private void postOrder(Node node) {
        if (node == null) {
          return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
      }
    
}
