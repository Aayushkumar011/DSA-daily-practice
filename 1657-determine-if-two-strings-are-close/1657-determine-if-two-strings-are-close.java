class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(n!=m)return false;
        HashSet<Character> set = new HashSet<>();
        int[] t1 = new int[26];
        int[] t2 = new int[26];
        for(int i=0;i<n;i++){
            t1[word1.charAt(i)-'a']++;
            set.add(word1.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(!set.contains(word2.charAt(i))){
                return false;
            }
            t2[word2.charAt(i)-'a']++;
        }
        Arrays.sort(t1);
        Arrays.sort(t2);
        for(int i=0;i<26;i++){
            if(t1[i]!=t2[i])return false;
        }
    return true;
    }
}