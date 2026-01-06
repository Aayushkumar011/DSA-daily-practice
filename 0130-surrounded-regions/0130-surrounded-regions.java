class Solution {
    public static void dfs(int i,int j,int n,int m,char[][]b,boolean[][] v,int[][] dir){
        if(i<0 || j<0 || i>=n || j>=m || v[i][j] || b[i][j]=='X')return;
        v[i][j]=true;
        for(int k=0;k<4;k++){
            dfs(i+dir[k][0],j+dir[k][1],n,m,b,v,dir);
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] v = new boolean[n][m];
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<n;i++){
            dfs(i,0,n,m,board,v,dir);
            dfs(i,m-1,n,m,board,v,dir);
        }
        for(int i=0;i<m;i++){
            dfs(0,i,n,m,board,v,dir);
            dfs(n-1,i,n,m,board,v,dir);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && !v[i][j]){
                        board[i][j]='X';  
                }  
            }
        }
    }
}