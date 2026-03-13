class Solution {
    public static boolean valid(List<char[]> board,int r,int c,int n){
        for(int i=r-1;i>=0;i--){
            if(board.get(i)[c]=='Q')return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(board.get(i)[j]=='Q')return false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
            if(board.get(i)[j]=='Q')return false;
        }
    return true;
    }
    public static void solve(List<char[]> board,List<List<String>> ans,int row,int n){
        if(row>=n){
            ArrayList<String> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                String ss = new String(board.get(i));
                a.add(ss);
            }
            ans.add(a);
            return;
        }
        for(int col=0;col<n;col++){
            if(valid(board,row,col,n)){
                board.get(row)[col]='Q';
                solve(board,ans,row+1,n);
                board.get(row)[col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<char[]> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] s = new char[n];
            Arrays.fill(s,'.');
            board.add(s);
        }
        solve(board,ans,0,n);
    return ans;
    }
}