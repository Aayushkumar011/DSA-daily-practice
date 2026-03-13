class Solution {
    public static boolean valid(char[][] b,char ch,int i,int j){
        for(int k=0;k<9;k++){
            if(b[i][k]==ch)return false;
            if(b[k][j]==ch)return false;
        }
        int start = i/3 *3;
        int end = j/3 *3;
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                if(b[start+k][end+l]==ch)return false;
            }
        }
    return true;
    }
    public static boolean solve(char[][] b){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(b[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(valid(b,ch,i,j)){
                            b[i][j]=ch;
                            if(solve(b))return true;
                            b[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}