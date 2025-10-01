class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int ans=0;
        int[] f = new int[128];
        for(int j=0;j<s.length();j++){
            while(f[s.charAt(j)]!=0){
                    f[s.charAt(i)]--;
                    i++;
            }
            f[s.charAt(j)]++;
            ans = Math.max(ans,j-i+1);  
        }
        return ans;
    }
}