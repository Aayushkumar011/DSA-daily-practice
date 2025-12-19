class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = 0;
        int r = mat[0].length-1;
        int n = mat.length;
        while(l<=r){
            int mid = l+(r-l)/2;
            int a = 0;
            for(int i=0;i<n;i++){
                if(mat[i][mid]>mat[i][a]){
                    a=i;
                }
            }
            int left = (mid>l)?mat[a][mid-1]:-1;
            int right = (mid<r)?mat[a][mid+1]:-1;
            if(mat[a][mid]>left && mat[a][mid]>right){
                return new int[]{a,mid};
               
            }
            break;
        }
        return new int[]{l,r};
    }
}