class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int m=(sum/2)+1;
        if(sum%2!=0)return false;
        boolean[][] dp = new boolean[n][m];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<m)dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                boolean notPick = dp[i-1][j];
                boolean pick = false;
                if(nums[i]<=j){
                    pick = dp[i-1][j-nums[i]];
                }
            dp[i][j]=pick||notPick;
            }
        }
    return dp[n-1][m-1];
    }
}