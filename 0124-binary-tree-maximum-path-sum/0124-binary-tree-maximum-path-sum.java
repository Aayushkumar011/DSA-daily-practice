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
    public static int pathsum(TreeNode n, int[] s){
        if(n==null)return 0;
        int l = Math.max(0,pathsum(n.left,s));
        int r = Math.max(0,pathsum(n.right,s));
        int tsum = l+r;
        s[0] = Math.max(tsum+n.val,s[0]);
    return Math.max(l,r)+n.val;
    }
    public int maxPathSum(TreeNode root) {
        int[] sum = new int[1];
        sum[0]=Integer.MIN_VALUE;
        if(root==null)return 0;
        int h = pathsum(root,sum);
    return sum[0];
    }
}