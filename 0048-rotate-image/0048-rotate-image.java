class Solution {
    public static void reverse(int[] arr,int n){
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void swap(int[][] matrix ,int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            int j=0;
            while(j<i){
                swap(matrix,i,j);
                j++;
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i],n);
        }
    }
}