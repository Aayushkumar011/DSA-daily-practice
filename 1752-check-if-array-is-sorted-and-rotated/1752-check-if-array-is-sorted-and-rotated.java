class Solution {
    public boolean check(int[] nums) {
        int s = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                s = i;
                break;
            }
        }
        for(int i=s+1;i<n+s;i++){
            if(nums[i%n]<nums[(i-1)%n])return false;
        }
    return true;
    }
}