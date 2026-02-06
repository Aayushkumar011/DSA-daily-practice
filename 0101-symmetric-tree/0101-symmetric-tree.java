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
    public static boolean rec(TreeNode n,TreeNode m){
        if(n==null && m==null)return true;
        else if(n==null || m==null)return false;
        else if(n.val!=m.val)return false;
        return rec(n.left,m.right) && rec(n.right,m.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return rec(root.left,root.right);
    }
}