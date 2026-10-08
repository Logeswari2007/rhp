import java.util.*;
public class TreeHeightofaBinaryTree {
    static class Node {
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
        
    }
    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        else if(val>root.data){
            root.right=insert(root.right, val);
        }else{
            root.left=insert(root.left, val);
        }
        return root;
    }
    public static int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=maxHeight(root.left);
        int rightcount=maxHeight(root.right);
        return 1+Math.max(leftcount,rightcount);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            root=insert(root, val);
        }
        System.out.print((maxHeight(root))-1);

    }
}
// hack rank