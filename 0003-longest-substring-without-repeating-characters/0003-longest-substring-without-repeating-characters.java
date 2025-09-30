class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++){
            if(!set.contains(s.charAt(i))){
                c++;
                set.add(s.charAt(i));
                ans = Math.max(ans,c);
            }
            else{
                set= new HashSet<>();
                set.add(s.charAt(i));
                c=1;
            }
        }
    return ans;
    }
}