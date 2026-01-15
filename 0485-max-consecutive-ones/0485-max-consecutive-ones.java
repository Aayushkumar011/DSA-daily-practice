class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int cc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)cc++;
            else cc=0;
            c=Math.max(c,cc);
        }
    return c;
    }
}