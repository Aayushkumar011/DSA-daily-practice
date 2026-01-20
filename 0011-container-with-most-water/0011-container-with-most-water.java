class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=n-1;
        int ans = -1;
        while(i<j){
            int w = j-i;
            if(nums[i]<=nums[j]){
                ans=Math.max(ans,nums[i]*w);
                i++;
            }
            else{
                ans=Math.max(ans,nums[j]*w);
                j--;
            }
        }
    return ans;
    }
}