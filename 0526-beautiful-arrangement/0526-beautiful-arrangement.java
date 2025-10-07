class Solution {
    int ans = 0;
    public int countArrangement(int n) {
        boolean[] dp = new boolean[n+1];
        fun(n,1,dp);
    return ans;
    }
    public void fun(int n,int p,boolean[] dp){
        if(p>n){
            ans++;
            return;
        }
        for(int i=1;i<=n;i++){
            if(!dp[i] && (i%p==0 || p%i==0)){
                dp[i]=true;
                fun(n,p+1,dp);
                dp[i]=false;
            }
        }
    }
}