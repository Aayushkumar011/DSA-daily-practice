class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
            maxValue = entry.getValue();
            maxKey = entry.getKey();
            }
        }
    return maxKey;
    }
}