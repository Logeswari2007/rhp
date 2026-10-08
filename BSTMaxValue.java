//Build a binary tree from the input, then find the largest value in the tree.
import java.util.*;
public class BSTMaxValue{
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    public static int maxValue(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int max=root.data;
        int rightmax=maxValue(root.right);
        int leftmax=maxValue(root.left);
        max=Math.max(max,rightmax);
        max=Math.max(max,leftmax);
        return max;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rootVal=sc.nextInt();
        Node root=new Node(rootVal);
        Map<Integer,Node> map=new HashMap<>();
        map.put(rootVal, root);
        for(int i=0;i<n-1;i++){
            int parent=sc.nextInt();
            int child=sc.nextInt();
            int direction=sc.next().charAt(0);
            Node parentNode=map.get(parent);
            Node childNode = map.get(child);
            if(childNode==null){
                childNode=new Node(child);
                map.put(child,childNode);
            }
            if(direction=='L'){
                parentNode.left=childNode;
            }else{
                parentNode.right=childNode;
            }
            
        }
        System.out.println(maxValue(root));
        sc.close();
    }
}