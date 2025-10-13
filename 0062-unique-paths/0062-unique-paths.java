class Solution {
    public static int helper(int row,int col,int m,int n){
        if(m<=row || n<=col)return 0;
        if(m-1==row || n-1==col)return 1;
        int right = helper(row,col+1,m,n);
        int down = helper(row+1,col,m,n);
    return right +down;
    }
    public int uniquePaths(int m, int n) {
        return helper(0,0,m,n);
    }
}