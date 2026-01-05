class Solution {
    public long maxMatrixSum(int[][] matrix) {
        Long sum = 0L;
        int min = Integer.MAX_VALUE;
        int c = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    c++;
                    sum+= -1*matrix[i][j];
                    min = Math.min(min,-1*matrix[i][j]);
                }
                else{
                    sum+= matrix[i][j];
                    min = Math.min(min,matrix[i][j]);
                }
            }
        }
    return (c%2==0)?sum:sum-2*min;
    }
}