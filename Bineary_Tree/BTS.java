package Bineary_Tree;

public class BTS {
    public static void main(String[] args) {
        BTS b= new BTS();
        int arr[]={1,2,3,4,5,6,7};
        b.populateSorted(arr);
        b.display();
    }

    public class Node {
    private int value;
    private Node left;
    private Node right;
    private int hight;
    public Node(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
    
    private Node root;

    public BTS(){

    }
    
    public void insert(int value){
        root=insert(value,root);
    }
    public Node insert(int val,Node node){
     if (node==null) {
        node=new Node(val);
        return node;
     }
     if(val<node.value){
        node.left=insert(val, node.left);
     }
     if (val> node.value) {
        node.right=insert(val, node.right);
     }
     node.hight= Math.max(hight(node.left), hight(node.right))+1;
     return node;
    }

    public void populateSorted(int []num){
        populateSortedArray(num,0,num.length);
    }

    public void populateSortedArray(int arr[],int start,int right){
        if(start>=right){
            return;
        }
        int mid=(start+right)/2;

        this.insert(arr[mid]);
        populateSortedArray(arr, start, mid);
        populateSortedArray(arr, mid+1, right);

    }

    public void display(){
        display(this.root,"Root Noot : ");
    }

    public void display(Node node,String details){
        if (node==null) {
            return ;
        }

        System.out.println(details + node.value);
        display(node.left ,"Left child of " + node.value + " : ");
        display(node.right , "Right child of " + node.value + " : " );
    }
    public boolean isEmpty(){
        return root == null;
    }

    public boolean balance(){
        return balance(root);
    }
    private boolean balance(Node node){
        if (node== null) {
            return true;
        }
        return Math.abs(hight(node.left)-hight(node.right)) <= 1 && balance(node.left) && balance(node.right);
    }

    public int hight(Node node) {
        if (node == null) {
          return -1;
        }
        return node.hight;
      }
        
    
}
