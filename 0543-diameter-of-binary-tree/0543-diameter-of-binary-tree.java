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
    public static int height(TreeNode n){
        if(n==null)return 0;
        return 1+Math.max(height(n.left),height(n.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
    return height(root.left) + height(root.right);
    }
}