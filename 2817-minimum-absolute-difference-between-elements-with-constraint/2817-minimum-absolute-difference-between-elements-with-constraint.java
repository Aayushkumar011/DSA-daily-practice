class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        if (x == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        int ans = Integer.MAX_VALUE;

        for(int i=x;i<nums.size();i++){
            set.add(nums.get(i - x));
            int curr = nums.get(i);
            Integer floor = set.floor(curr);
            if(floor != null){
                ans = Math.min(ans, curr - floor);
            }
            Integer ceil = set.ceiling(curr);
            if(ceil != null){
                ans = Math.min(ans, ceil - curr);
            }
            if(ans==0)return 0;
        }
        return ans;
    }
}
