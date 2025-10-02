class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j= 0;
        long sum = 0;
        int ans = 0;
        while(j<n){
            sum+=nums[j];
            while((long)nums[j]*(j-i+1)-sum>k){
                sum-=nums[i++];
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}