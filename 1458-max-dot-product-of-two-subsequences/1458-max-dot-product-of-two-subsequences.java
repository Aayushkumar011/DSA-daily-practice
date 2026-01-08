class Solution {
    public static int solve(int i,int j,int n,int m,int[] n1,int[] n2,int[][] dp){
        if(i>=n || j>=m)return (int)-1e9;
        if(dp[i][j] != Integer.MIN_VALUE)return dp[i][j];
        int v1 = n1[i]*n2[j];
        int v2 = n1[i]*n2[j] + solve(i+1,j+1,n,m,n1,n2,dp);
        int v3 = solve(i,j+1,n,m,n1,n2,dp);
        int v4 = solve(i+1,j,n,m,n1,n2,dp);
    return dp[i][j] = Math.max(v1,Math.max(v2,Math.max(v3,v4)));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int[][] dp = new int[n+1][m+1];
        for(int[] row : dp)Arrays.fill(row, Integer.MIN_VALUE);
        int ans = solve(i,j,n,m,nums1,nums2,dp);
    return ans;
    }
}