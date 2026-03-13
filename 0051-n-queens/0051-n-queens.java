class Solution {
    public static void solve(List<char[]> board,List<List<String>> ans,int row,int n,HashSet<Integer> co,HashSet<Integer> dig,HashSet<Integer> andig){
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
            if(!co.contains(col) && !dig.contains(row+col) && !andig.contains(row-col)){
                board.get(row)[col]='Q';
                co.add(col);
                dig.add(row+col);
                andig.add(row-col);
                solve(board,ans,row+1,n,co,dig,andig);
                board.get(row)[col]='.';
                co.remove(col);
                dig.remove(row+col);
                andig.remove(row-col);
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
        HashSet<Integer> co = new HashSet<>();
        HashSet<Integer> dig = new HashSet<>();
        HashSet<Integer> andig = new HashSet<>();
        solve(board,ans,0,n,co,dig,andig);
    return ans;
    }
}