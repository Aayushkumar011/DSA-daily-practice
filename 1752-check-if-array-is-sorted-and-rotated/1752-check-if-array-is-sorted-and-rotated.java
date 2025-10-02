class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                c = i;
                break;
            }
        }
        if(c==0)return true;
        for(int i=c+1;i<n+c;i++){
            if(nums[(i-1)%n]>nums[i%n])return false;
        }
        return true;
    }
}