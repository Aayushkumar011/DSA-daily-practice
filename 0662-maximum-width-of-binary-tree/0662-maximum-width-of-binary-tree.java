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
 class pair{
    TreeNode n;
    int num;
    pair(TreeNode n,int num){
        this.n = n;
        this.num = num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int left = 0;
        int right = 0;
        int s = 0;
        while(!q.isEmpty()){
            int l = q.size();
            int minVal = q.peek().num;
            for(int i=0;i<l;i++){
                TreeNode n = q.peek().n;
                int currVal = q.peek().num-minVal;
                q.poll();
                if(n.left!=null){
                    q.add(new pair(n.left,currVal*2+1));
                }
                if(n.right!=null){
                    q.add(new pair(n.right,currVal*2+2));
                }
                if(i==0)left = currVal;
                if(i==l-1)right = currVal;
            }
            s = Math.max(s,right-left+1);
        }
    return s;
    }
}