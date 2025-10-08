class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch!='.'){
                    board[i][j]='.';
                    if(!check(board,i,j,ch))return false;
                }
            }
        }
        return true;
    }
    boolean check(char[][] board,int r,int c,char ch){
        for(int i=0;i<9;i++){
            if(board[i][c]==ch)return false;
            if(board[r][i]==ch)return false;
        }
        int row = (r/3)*3;
        int col = (c/3)*3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(board[i][j]==ch)return false;
            }
        }
    return true;
    }
}