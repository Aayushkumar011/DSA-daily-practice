/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void rec(TreeNode n, TreeNode f, ArrayList<TreeNode> path){
        if(n==null)return;
        path.add(n);
        if(n==f)return;
        int size = path.size();
        rec(n.left,f,path);
        if(path.size()>size)return;
        rec(n.right,f,path);
        if(path.size()>size)return;
        path.remove(path.size()-1);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        rec(root,p,path1);
        rec(root,q,path2);
        TreeNode ans = root;
        int i=0;
        while(i<path1.size() && i<path2.size()){
            if(path1.get(i).val==path2.get(i).val){
                ans = path1.get(i);
            }
            else break;
            i++;
        }
    return ans;
    }
}