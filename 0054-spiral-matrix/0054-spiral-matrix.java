class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left=0,right=m-1,top=0,bottom=n-1;
        while(left<=right && top<=bottom){
            int l=left;
            while(l<=right){
                arr.add(matrix[top][l]);
                l++;
            }
            top++;
            int t=top;
            while(t<=bottom){
                arr.add(matrix[t][right]);
                t++;
            }
            right--;
            if(top<=bottom){
                int r=right;
                while(r>=left){
                    arr.add(matrix[bottom][r]);
                    r--;
                }
                bottom--;
            }
            
            int b=bottom;
            if(left<=right){
                
                while(b>=top){
                    arr.add(matrix[b][left]);
                    b--;
                }
                left++;
            }
            
            
        }
        return arr;
    }
}