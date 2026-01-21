class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int msum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            msum = Math.max(sum,msum);
            if(sum<0)sum=0;
        }
    return msum;
    }
}