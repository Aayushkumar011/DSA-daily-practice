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
 class tuple{
    TreeNode n;
    int ver;
    int lev;
    tuple(TreeNode n,int ver,int lev){
        this.n = n;
        this.ver = ver;
        this.lev = lev;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(root,0,0));
        while(!q.isEmpty()){
            tuple p = q.poll();
            TreeNode node = p.n;
            int verticle = p.ver;
            int level = p.lev;
            if(!map.containsKey(verticle)){
                map.put(verticle,new TreeMap<>());
            }
            if(!map.get(verticle).containsKey(level)){
                map.get(verticle).put(level,new PriorityQueue<>());
            }
            map.get(verticle).get(level).add(node.val);
            if(node.left!=null){
                q.add(new tuple(node.left, verticle - 1, level + 1));
            }
            if(node.right!=null){
                q.add(new tuple(node.right, verticle + 1, level + 1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> e : map.values()){
            ArrayList<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> pq : e.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
    return ans;
    }
}