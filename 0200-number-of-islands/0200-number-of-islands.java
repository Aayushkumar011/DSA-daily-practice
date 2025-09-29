class Solution {
    void clear(char grid[][],int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0')return;
        grid[r][c]='0';
        clear(grid,r+1,c);
        clear(grid,r-1,c);
        clear(grid,r,c+1);
        clear(grid,r,c-1);
    }
    public int numIslands(char[][] grid) {
        int c = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    c++;
                clear(grid,i,j);
                }
            }
        }
        return c;
    }
}