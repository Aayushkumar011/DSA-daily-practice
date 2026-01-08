class pair{
    String key;
    int val;
    pair(String key,int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public static String replace(String word,int i,int j){
        char[] arr = word.toCharArray();
        arr[i] = (char)('a'+j);
    return new String(arr);
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String s : wordList){
            set.add(s);
        }
        if(beginWord.equals(endWord) || !set.contains(endWord))return 0;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(beginWord,1));
        int n = beginWord.length();
        while(!q.isEmpty()){
            pair p = q.poll();
            String w = p.key;
            int v = p.val;
            for(int i=0;i<n;i++){
                for(int j=0;j<26;j++){
                    String str = replace(w,i,j);
                    if(set.contains(str)){
                        if(str.equals(endWord))return v+1;
                        q.add(new pair(str,v+1));
                        set.remove(str);
                    }
                }
            }    
        }
    return 0;
    }
}