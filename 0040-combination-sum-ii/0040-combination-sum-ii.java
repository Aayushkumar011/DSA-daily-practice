class Solution {
    public static void help(int[] c, int t, List<List<Integer>> ans,int i,int sum,List<Integer> a){
        if(i>=c.length){
            if(sum==t){
                ans.add(new ArrayList<>(a));
            }
            return;
        }
        if(sum>t)return;
        a.add(c[i]);
        help(c,t,ans,i+1,sum+c[i],a);
        a.remove(a.size()-1);
        int j = i;
        while(j + 1 < c.length && c[j] == c[j+1]){
            j++;
        }
        help(c,t,ans,j+1,sum,a);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        help(candidates,target,ans,0,0,new ArrayList<>());
    return ans;
    }
}