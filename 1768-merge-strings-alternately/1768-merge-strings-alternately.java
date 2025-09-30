class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder s = new StringBuilder();
        while(i<l1 && j<l2){
            s.append(word1.charAt(i++));
            s.append(word2.charAt(j++));
        }
        while(i<l1){
            s.append(word1.charAt(i++));
        }
        while(j<l2){
            s.append(word2.charAt(j++));
        }
        return s.toString();
    }
}