class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int min = Integer.MAX_VALUE;
                if(j-1>=0){
                    if(min>matrix[i-1][j-1])min=matrix[i-1][j-1];
                }
                if(min>matrix[i-1][j])min=matrix[i-1][j];
                if(j+1<m){
                    if(min>matrix[i-1][j+1])min=matrix[i-1][j+1];
                }
                matrix[i][j]+=min;
            }
        }
        int minn = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            minn=Math.min(minn,matrix[n-1][i]);
        }
        return minn;
    }
}