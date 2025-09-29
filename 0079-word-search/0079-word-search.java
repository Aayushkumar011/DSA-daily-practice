class Solution {
    public static boolean check(char[][] board, String word, int[][] a, int r, int c, int index, boolean[][] visited){
        if(index==word.length())return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(index)  || visited[r][c])return false;

        visited[r][c] = true;
        for(int i=0;i<4;i++){
            if(check(board,word,a,r+a[i][0],c+a[i][1],index+1,visited)){
                visited[r][c] = false;
                return true;
            }
        }
        visited[r][c] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int k=0;
        int[][] a = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(check(board,word,a,i,j,k,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}