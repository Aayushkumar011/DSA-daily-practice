class Solution {
    int count = 0, target = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) target |= num;
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int i, int curr) {
        if (i == nums.length) {
            if (curr == target) count++;
            return;
        }
        dfs(nums, i + 1, curr | nums[i]);
        dfs(nums, i + 1, curr);
    }
}
