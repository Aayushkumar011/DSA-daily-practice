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
    public static int depth(TreeNode n,int[] ans){
        if(n==null)return 0;
        int l = depth(n.left,ans);
        int r = depth(n.right,ans);
        int path = l+r;
        ans[0] = Math.max(ans[0],path);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = {0};
        depth(root,ans);
    return ans[0];
    }
}