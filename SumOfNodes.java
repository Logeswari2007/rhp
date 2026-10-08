import java.util.*;
public class SumOfNodes{
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
        }
    }
    static Scanner sc=new Scanner(System.in);
    public static Node buildTree(){
        int val=sc.nextInt();
        if(val==-1){
            return null;
        }
        Node root=new Node(val);
        root.left=buildTree();
        root.right=buildTree();
        return root;
    }
    public static int SumNode(Node root){
        if(root==null){
            return 0;
        }
       return root.data+SumNode(root.right)+SumNode(root.left);
    }
    public static void main(String args[]){
        Node root=buildTree();
        System.out.println(SumNode(root));

    }
}

/*An adventure game stores the locations of treasure chests as a binary tree, where each node represents a treasure chest and its value indicates the number of gold coins it contains. To calculate the total wealth hidden in the dungeon, the game needs to determine the sum of the values of all treasure chests.

Determine the total number of gold coins by calculating the sum of all node values in the binary tree.

Input Format

The input consists of integers entered on separate lines, representing the treasure chests in the dungeon as a binary tree.
The first integer represents the root treasure chest.
For every treasure chest, the left child treasure chest is entered first, followed by the right child treasure chest.
Enter -1 if a child treasure chest does not exist.
The dungeon is represented in preorder traversal, where the entire left subtree is provided before the right subtree.

Output Format

Print a single integer representing the sum of all gold coins stored in the treasure chests.

Example:

Input:

10
5
2
-1
-1
7
-1
-1
15
12
-1
-1
20
-1
-1


Output:

71


Explanation:

The input represents the following binary tree:

     10
    /  \
   5    15
  / \   / \
 2   7 12 20


The total number of gold coins is:

10 + 5 + 2 + 7 + 15 + 12 + 20 = 71


Therefore, the total wealth hidden in the dungeon is 71. */