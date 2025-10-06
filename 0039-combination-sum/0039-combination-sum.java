class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> com = new ArrayList<>();
        int sum=0;
        helper(ans,com,candidates,sum,target,0);
        return ans;
    }
    public static void helper(List<List<Integer>> ans,List<Integer> com,int[] c,int sum,int target,int s){
        if(sum==target){
            ans.add(new ArrayList<>(com));
            return;
        }
        if(sum>target)return;
        for(int i=s;i<c.length;i++){
            com.add(c[i]);
            sum+=c[i];
            helper(ans,com,c,sum,target,i);
            sum-=c[i];
            com.remove(com.size()-1);
        }
    }
}