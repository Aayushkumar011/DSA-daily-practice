class Solution {
    public boolean isTrionic(int[] nums) {
        int c=2;
        int i=1;
        if (nums[1] <= nums[0]) return false;
        while(i<nums.length){
            if (nums[i] == nums[i-1]) return false;
            if(c==2 && nums[i]<nums[i-1]){
                c=1;
            }
            else if(c==1 && nums[i]>nums[i-1]){
                c=0;
            }
            else if(c==0 && nums[i]<nums[i-1]){
                return false;
            }
            i++;
        }
    if(c==0)return true;
    else return false;
    }
}