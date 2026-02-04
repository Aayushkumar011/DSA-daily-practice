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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int c= 0;
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode n = q.poll();
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
                level.add(n.val);
            }
            if(c%2!=0){
                Collections.reverse(level);
            }
            c++;
            ans.add(level);
        }
    return ans;
    }
}