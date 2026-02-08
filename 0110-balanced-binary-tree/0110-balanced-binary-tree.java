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
        int l = height(n.left);
        if(l==-1)return -1;
        int r = height(n.right);
        if(r==-1)return -1;
        if(Math.abs(l-r)>1){
            l=-1;
            return -1;
        }
        else return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int h = height(root);
        if(h==-1)return false;
        return true;
    }
}