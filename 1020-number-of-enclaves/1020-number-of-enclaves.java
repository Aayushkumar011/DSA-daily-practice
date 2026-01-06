class Solution {
    public static int bfs(int i,int j,int n,int m,int[][] grid,boolean[][] v,int[][] dir){
        Queue<int[]> q = new LinkedList<>();
        int co = 0;
        v[i][j]=true;
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            co++;
            int[] arr = q.poll();
            int a = arr[0];
            int b = arr[1];
            for(int k=0;k<4;k++){
                int r = a+dir[k][0];
                int c = b+dir[k][1];
                if(r>=0 && c>=0 && r<n && c<m && !v[r][c] && grid[r][c]!=0){
                    v[r][c]=true;
                    q.add(new int[]{r,c});
                }
            }
        }
        return co;
    }
    public static void dfs(int i,int j,int n,int m,int[][] grid,boolean[][] v,int[][] dir){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || v[i][j])return;
        v[i][j]=true;
        for(int k=0;k<4;k++){
            dfs(i+dir[k][0],j+dir[k][1],n,m,grid,v,dir);
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] v = new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(i,0,n,m,grid,v,dir);
            dfs(i,m-1,n,m,grid,v,dir);
        }
        for(int i=0;i<m;i++){
            dfs(0,i,n,m,grid,v,dir);
            dfs(n-1,i,n,m,grid,v,dir);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !v[i][j]){
                    ans += bfs(i,j,n,m,grid,v,dir);
                }
            }
        }
    return ans;
    }
}