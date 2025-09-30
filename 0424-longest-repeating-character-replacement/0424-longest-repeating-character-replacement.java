class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int first = 0;
        int maxc = 0;
        int ans = 0;
        int[] f = new int[26];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'A']++;
            maxc = Math.max(maxc,f[s.charAt(i)-'A']);
            if((i-first+1)-maxc>k){
                f[s.charAt(first)-'A']--;
                first++;
            }
            ans=Math.max(ans,i-first+1);
        }
        return ans;
    }
}