class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = 2*n;
        int[] ans = new int[l];
        ans[0]=nums[0];
        ans[l-1]=nums[l-1];
        int j=0;
        for(int i=1;i<l-1;i+=2){
            ans[i]=nums[n+j];
            ans[i+1]=nums[j+1];
            j++;
        }
    return ans;
    }
}