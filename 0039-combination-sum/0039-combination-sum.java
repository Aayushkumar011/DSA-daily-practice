class Solution {
    public static void help(int[] c, int t, List<List<Integer>> ans, int i,int sum,List<Integer> a){
        if(i>=c.length){
            if(sum==t){
                ans.add(new ArrayList<>(a));
            }
            return;
        }
        if(sum>t)return;
        help(c,t,ans,i+1,sum,a);
        a.add(c[i]);
        help(c,t,ans,i,sum+c[i],a);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        help(candidates,target,ans,0,0,new ArrayList<>());
    return ans;
    }
}