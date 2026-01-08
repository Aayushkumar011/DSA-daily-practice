// class Solution {
//     public static String replace(String word,int i,char ch){
//         char[] arr = word.toCharArray();
//         arr[i] = ch;
//     return new String(arr);
//     }
//     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//         int n = beginWord.length();
//         List<List<String>> ans = new ArrayList<>();
//         HashSet<String> set = new HashSet<>();
//         for(String s : wordList){
//             set.add(s);
//         }
//         if(beginWord.equals(endWord) || !set.contains(endWord))return ans;
//         Queue<List<String>> q = new LinkedList<>();
//         List<String> a = new ArrayList<>();
//         List<String> remove_from_set = new ArrayList<>();
//         a.add(beginWord);
//         q.add(a);
//         boolean flag = false;
//         while(!q.isEmpty()){
//             int l = q.size();
//             for(int k=0;k<l;k++){
//                 List<String> str = q.poll();
//                 String word = str.get(str.size()-1);
//                 for(int i=0;i<n;i++){
//                     for(char ch='a';ch<='z';ch++){
//                         String cs = replace(word,i,ch);
//                         if(cs.equals(endWord))flag = true;
//                         if(set.contains(cs)){
//                             List<String> new_a = new ArrayList<>(str);
//                             new_a.add(cs);
//                             q.add(new_a);
//                             remove_from_set.add(cs);
//                         }
//                     }
//                 }
//             }
//             if(flag)break;
//             for(String s : remove_from_set){
//                 set.remove(s);
//             }
//             remove_from_set = new ArrayList<>();
//         }
//         while(!q.isEmpty()){
//             List<String> res = q.poll();
//             if(endWord.equals(res.get(res.size()-1))){
//                 ans.add(res);
//             }
//         }
//     return ans;
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>(); 
        Map<String, Set<String>> reverse = new HashMap<>(); // reverse graph start from endWord
        Set<String> wordSet = new HashSet<>(wordList); // remove the duplicate words
        wordSet.remove(beginWord); // remove the first word to avoid cycle path
        Queue<String> queue = new LinkedList<>(); // store current layer nodes
        queue.add(beginWord); // first layer has only beginWord
        Set<String> nextLevel = new HashSet<>(); // store nextLayer nodes
        boolean findEnd = false; // find endWord flag
        while (!queue.isEmpty()) { // traverse current layer nodes
            String word = queue.remove();
            for (String next : wordSet) {
                if (isLadder(word, next)) { // is ladder words
					// construct the reverse graph from endWord
                    Set<String> reverseLadders = reverse.computeIfAbsent(next, k -> new HashSet<>());
                    reverseLadders.add(word); 
                    if (endWord.equals(next)) {
                        findEnd = true;
                    }
                    nextLevel.add(next); // store next layer nodes
                }
            }
            if (queue.isEmpty()) { // when current layer is all visited
                if (findEnd) break; // if find the endWord, then break the while loop
                queue.addAll(nextLevel); // add next layer nodes to queue
                wordSet.removeAll(nextLevel); // remove all next layer nodes in wordSet
                nextLevel.clear();
            }
        }
        if (!findEnd) return ans; // if can't reach endWord from startWord, then return ans.
        Set<String> path = new LinkedHashSet<>();
        path.add(endWord);
		// traverse reverse graph from endWord to beginWord
        findPath(endWord, beginWord, reverse, ans, path); 
        return ans;
    }


    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
                                 List<List<String>> ans, Set<String> path) {
        Set<String> next = graph.get(endWord);
        if (next == null) return;
        for (String word : next) {
            path.add(word);
            if (beginWord.equals(word)) {
                List<String> shortestPath = new ArrayList<>(path);
                Collections.reverse(shortestPath); // reverse words in shortest path
                ans.add(shortestPath); // add the shortest path to ans.
            } else {
                findPath(word, beginWord, graph, ans, path);
            }
            path.remove(word);
        }
    }

    private boolean isLadder(String s, String t) {
        if (s.length() != t.length()) return false;
        int diffCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) diffCount++;
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }
}