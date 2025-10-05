class Solution {
    public static int helper(int row, int col, int m, int n, int[][] dp) {
        if(m<=row || n<=col)return 0;
        if(m-1==row || n-1==col)return 1;

        if(dp[row][col]!=-1)return dp[row][col];

        int right = helper(row,col+1,m,n,dp);
        int down = helper(row+1,col,m,n,dp);

        return dp[row][col] = right + down;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(0,0,m,n,dp);
    }
}
