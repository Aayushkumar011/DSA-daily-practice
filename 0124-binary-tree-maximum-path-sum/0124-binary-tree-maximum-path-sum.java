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
    public static int find(TreeNode n,int[] sum){
        if(n==null)return 0;
        int l = Math.max(0,find(n.left,sum));
        int r = Math.max(0,find(n.right,sum));
        int s = l+r+n.val;
        sum[0] = Math.max(sum[0],s);
        return Math.max(l,r)+n.val;
    }
    public int maxPathSum(TreeNode root) {
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        find(root,sum);
    return sum[0];
    }
}