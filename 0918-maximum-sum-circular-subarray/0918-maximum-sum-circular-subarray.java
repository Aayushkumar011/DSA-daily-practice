class Solution {
    public static int helper(int[] nums){
        int Msum = Integer.MIN_VALUE;
        int Csum = 0;
        for(int i=0;i<nums.length;i++){
            Csum += nums[i];
            Msum = Math.max(Msum,Csum);
            
            if(Csum<0){
                Csum=0;
            }
        }
    return Msum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int ans1 = helper(nums);
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            nums[i]=-1*nums[i];
        }
        int ans2 = helper(nums);
        if(ans1<0) return ans1;
        return Math.max(ans1,total+ans2);
    }
}