class Solution {
    public static int binarysearch(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]<0){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return n-ans;
    }
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int neg = 0;
        for(int i=0;i<n;i++){
            neg+=binarysearch(grid[i]);
        }
        return neg;
    }
}