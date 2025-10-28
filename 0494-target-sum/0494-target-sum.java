class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int n : nums) total += n;
        if (Math.abs(target) > total || (target + total) % 2 != 0) {
            return 0;
        }

        int sum = (target + total) / 2;
        if (sum < 0) return 0;

        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = sum; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[sum];
    }
}
