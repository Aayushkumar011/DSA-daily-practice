class Solution {
    public int longestOnes(int[] nums, int k) {
        int co=0;
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int c= k;
            for(int j=i;j<n;j++){
                if(nums[j]==1)co++;
                else if(c>0){
                    co++;
                    c--;
                }
                else break;
            }
            ans=Math.max(ans,co);
            co=0;
        }
        return ans;
    }
}