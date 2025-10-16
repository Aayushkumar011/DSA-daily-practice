class Solution {
    public int maximumCount(int[] nums) {
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)k++;
            else if(nums[i]>0)j++;
        }
    return Math.max(k,j);
    }
}