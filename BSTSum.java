/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sumBT(Node root) {
        // code here
        if(root==null){
            return 0;
        }
        int sum=root.data;
        int rightsum=sumBT(root.right);
        int leftsum=sumBT(root.left);
        sum+=rightsum;
        sum+=leftsum;
        return sum;
    }
} // greeks to greeks
// leetcode to find max depth (104)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
       
        int leftcount=maxDepth(root.left);
        int rightcount=maxDepth(root.right);
        
        return 1+Math.max(leftcount,rightcount);
    }
}