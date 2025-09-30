class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int first=0;
        int maxf = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)maxf++;
            while((i-first+1)-maxf>k){
                if(nums[first]==1)maxf--;
                first++;
            }
            ans = Math.max(ans,i-first+1);
        }
        return ans;
    }
}