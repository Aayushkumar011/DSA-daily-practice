class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        int ans = fun(text1,text2,0,0,dp);
        return ans;
    }
    public static int fun(String a,String b,int i,int j,Integer[][] dp){
        if(i>=a.length() || j>=b.length())return 0;
        if(dp[i][j]!=null)return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j]=1+fun(a,b,i+1,j+1,dp);
        }
        else return dp[i][j]=Math.max(fun(a,b,i,j+1,dp),fun(a,b,i+1,j,dp));
    }
}