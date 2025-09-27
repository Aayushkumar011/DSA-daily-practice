class Solution {
    public int findPeakElement(int[] nums) {
        int a = Integer.MIN_VALUE;
        int n = nums.length;
        if(n==1)return 0;
        if(nums[n-1]>nums[n-2])return n-1;
        for(int i=1;i<n;i++){
            if(a<nums[i-1] && nums[i]<nums[i-1])return i-1;
            else{
                a=nums[i-1];
            }
        }
        return -1;
    }
}