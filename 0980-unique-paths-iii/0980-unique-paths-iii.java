class Solution {
    int ans=0;
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int empty = 1;
        int row = 0;
        int col = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0)empty++;
                else if(grid[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
        dsf(grid,row,col,n,m,empty,0,dir);
        return ans; 
    }
    public void dsf(int[][]grid,int i,int j,int n,int m,int e,int c,int[][] dir){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==-1)return;
        if(grid[i][j]==2){
            if(c==e)ans++;
            return;
        }
        int num = grid[i][j];
        grid[i][j]=-1;
        for(int[] a:dir){
            dsf(grid,i+a[0],j+a[1],n,m,e,c+1,dir);
        }
        grid[i][j]=num;
    }
}