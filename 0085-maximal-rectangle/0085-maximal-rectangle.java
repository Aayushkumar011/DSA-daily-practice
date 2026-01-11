class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            int[] ans = new int[m];
            for(int j=i;j<n;j++){
                for(int k=0;k<m;k++){
                if (matrix[j][k] == '1')
                        ans[k]++;         
                    else
                        ans[k] = 0;       
                }
                int h = j-i+1;
                int sum=0;
                for(int k=0;k<m;k++){
                    if(ans[k]==h){
                        sum+=h;
                        res = Math.max(res,sum);
                    }
                    else sum=0;
                }
            }
        }
        return res;
    }
}