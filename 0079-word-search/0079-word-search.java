class Solution {
    public static boolean search(char[][] board,int n,int m, String word,int l,int i,int j,int k,boolean[][] vis,int[][] dir){
        if(k==l)return true;
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] ||  board[i][j]!=word.charAt(k))return false;
        vis[i][j]=true;
        for(int z=0;z<4;z++){
            if(search(board,n,m,word,l,i+dir[z][0],j+dir[z][1],k+1,vis,dir)){
                return true;
            }
        }
        vis[i][j]=false;
    return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int l = word.length();
        boolean ans = false;
        boolean[][] vis = new boolean[n][m];
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,n,m,word,l,i,j,0,vis,dir)){
                        ans=true;
                        break;
                    }
                }
            }
        }
    return ans;
    }
}