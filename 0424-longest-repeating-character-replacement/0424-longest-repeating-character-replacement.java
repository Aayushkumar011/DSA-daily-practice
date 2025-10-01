class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int ans=0;
        int n = s.length();
        int max=0;
        int[] f = new int[26];
        for(int j=0;j<n;j++){
            char ch = s.charAt(j);
            f[ch-'A']++;
            max = Math.max(max,f[ch-'A']);
            while((j-i+1)-max>k){
                f[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            
        }
    return ans;
    }
}