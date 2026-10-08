import java.util.*;

public class BSTLowestCommonAncestor{

    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val) {
        if(root==null){
            return new Node(val);
        }
        else if(val < root.data){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }      
    public static Node findlca(Node root,int a, int b){
        while(root!=null){
            if(a<root.data && b<root.data){
                root= root.left;
            }
            else if(a>root.data && b>root.data){
                root =root.right;
            }
            else{
                return root;
            }
            
        }
    return null;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int arr[]=new int[n];
        Node root=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
           root=insert(root,val);
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        Node lca=findlca(root,a,b);
        System.out.println(lca.data);
        sc.close();

    }                                                                                                                                                                                                                                                                                                                                                                                                          
}
