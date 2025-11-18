class Solution {
    public static int helper(int[][] grid,int i,int j,int[][] dir){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int area = 1;
        for(int k=0;k<4;k++){
            area+= helper(grid,i+dir[k][0],j+dir[k][1],dir);
        }
    return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,helper(grid,i,j,dir));
                }
            }
        }
    return ans;
    }
}