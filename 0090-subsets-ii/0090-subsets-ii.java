class Solution {
    public static void help(int[] nums,List<List<Integer>> ans,int i,List<Integer> a){
        if(i>=nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        help(nums,ans,i+1,a);
        a.remove(a.size()-1);
        int j=i;
        while(j+1 < nums.length && nums[j]==nums[j+1]){
            j++;
        }
        help(nums,ans,j+1,a);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        help(nums,ans,0,new ArrayList<>());
    return ans;
    }
}