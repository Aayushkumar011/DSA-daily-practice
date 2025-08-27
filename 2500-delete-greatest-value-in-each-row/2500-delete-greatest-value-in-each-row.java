class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] arr : grid){
            Arrays.sort(arr);
        }
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<m;i++){
            int max = 0;
            for(int j=0;j<n;j++){
                max = Math.max(max,grid[j][i]);
            }
            sum += max;
        }
    return sum;
    }
}