class Solution {
    public int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i=1;i<m;i++){
            arr[0][i]+=arr[0][i-1];
        }
        for(int i=1;i<n;i++){
            arr[i][0]+=arr[i-1][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j]+=Math.min(arr[i-1][j],arr[i][j-1]);
            }
        }
    return arr[n-1][m-1];
    }
}