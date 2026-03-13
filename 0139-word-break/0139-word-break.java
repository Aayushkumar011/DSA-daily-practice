class Solution {
    public static boolean find(String s,int n,int ind,HashSet<String> set, Boolean[] dp){
        if(ind>=n){
            return true;
        }
        if(dp[ind]!=null)return dp[ind];
        for(int i=ind;i<n;i++){
            String str = s.substring(ind,i+1);
            if(set.contains(str)){
                if(find(s,n,i+1,set,dp)){
                    return dp[ind] = true;
                }
            }
        }
    return dp[ind] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        Boolean[] dp = new Boolean[s.length()]; 
        for(String ss : wordDict){
            set.add(ss);
        }
        if(set.contains(s))return true;
    return find(s,s.length(),0,set,dp);
    }
}