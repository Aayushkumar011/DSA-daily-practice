class Solution {
    public static void reverse(int[] arr,int n){
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
                arr[i] = arr[n-(i+1)];
                arr[n-(i+1)] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i],n);
        }
    }
}