class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index==-1)return word;
        StringBuilder s = new StringBuilder();
        for(int i=index;i>=0;i--){
            s.append(word.charAt(i));
        }
        s.append(word.substring(index+1));
        return s.toString();
    }
}