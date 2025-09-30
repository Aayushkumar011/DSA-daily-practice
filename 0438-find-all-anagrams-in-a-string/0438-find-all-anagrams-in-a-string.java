class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        int window=m;
        ArrayList<Integer> a = new ArrayList<>();
        if(m>n)return a;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i=0;i<m;i++){
            f2[p.charAt(i)-'a']++;
        }
        for(int i=0;i<window;i++){
            f1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2))a.add(0);
        for(int i=window;i<n;i++){
            f1[s.charAt(i-window)-'a']--;
            f1[s.charAt(i)-'a']++;
            if(Arrays.equals(f1,f2))a.add(i-window+1);
        }
    return a;
    }
}