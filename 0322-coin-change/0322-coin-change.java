class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[amount][coins.length];
        int ans = helper(coins,amount,0,0,dp);
    return ans>=amount+1?-1:ans;
    }
    public static int helper(int[] coins, int amount,int i,int sum,Integer[][] dp){
        if(sum==amount)return 0;
        if(dp[sum][i]!=null)return dp[sum][i];
        int ans = amount+1;
        for(int j=i;j<coins.length;j++){
            if(0l+sum+coins[j]<=amount){
                ans=Math.min(ans,1+helper(coins,amount,j,sum+coins[j],dp));
                if (ans != amount + 1){
                    ans = Math.min(ans, 1 + ans);
                }
            }
        }
        dp[sum][i]=ans;
    return ans;
    }
}