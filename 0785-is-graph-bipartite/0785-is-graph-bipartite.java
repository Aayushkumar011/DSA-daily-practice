class Solution {
    public static boolean dfs(int i,int c,int[][] g,int[] v){
        if(v[i]!=-1 && v[i]==c)return false;
        if(v[i]!=-1 && v[i]!=c)return true;
        v[i]=c;
        for(int e : g[i]){
            if(dfs(e,1-c,g,v))return true;
        }
    return false;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] v = new int[n];
        Arrays.fill(v,-1);
        for(int i=0;i<n;i++){
            if(v[i]==-1){
                if(dfs(i,0,graph,v)){
                    return false;
                }
            }
        }
    return true;
    }
}