class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n+2][n+2];
    return fun(nums,0,-1,dp);
    }
    public static int fun(int[] nums,int i,int j,Integer[][] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i+1][j+1]!=null)return dp[i+1][j+1];
        int taken = 0;
        if(j==-1 || nums[i]>nums[j]){
            taken = 1+fun(nums,i+1,i,dp);
        }
        int notTaken = fun(nums,i+1,j,dp);
        dp[i+1][j+1] = Math.max(taken, notTaken);
        return dp[i+1][j+1];
    }
}