class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        Queue<Integer> q = new LinkedList<>();
        int[] v = new int[n];
        Arrays.fill(v,-1);
        for(int i=0;i<n;i++){
           if(v[i]==-1){
            q.add(i);
            v[i]=0;
                while(!q.isEmpty()){
                    int e = q.poll();
                    for(int ele : graph[e]){
                        if(v[ele]!=-1){
                            if(v[e]==v[ele])return false;
                        }
                        else{
                            v[ele] = Math.abs(v[e]-1);
                            q.add(ele);
                        }
                    }
                }
            }
        }
    return true;
    }
}