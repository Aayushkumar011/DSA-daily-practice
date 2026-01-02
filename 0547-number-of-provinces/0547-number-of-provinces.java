class Solution {
    public static void dfs(int[][] arr,boolean[] v,int a){
        v[a]=true;
        for(int i=0;i<arr[a].length;i++){
            if(arr[a][i]==1){
                if(!v[i])dfs(arr,v,i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] v = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!v[i]){
                dfs(isConnected,v,i);
                c++;
            }
        }  
    return c;
    }
}