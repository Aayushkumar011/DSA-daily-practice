class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        ArrayList<Integer> ans = new ArrayList<>();
        if(m>n)return ans;
        int window=m;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i=0;i<m;i++){
            f1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<window;i++){
            f2[s.charAt(i)-'a']++;
        } 
        if(Arrays.equals(f1,f2))ans.add(0);
        for(int i=window;i<n;i++){
            f2[s.charAt(i-window)-'a']--;
            f2[s.charAt(i)-'a']++;
            if(Arrays.equals(f1,f2))ans.add(i-window+1);
        }
    return ans;
    }
}