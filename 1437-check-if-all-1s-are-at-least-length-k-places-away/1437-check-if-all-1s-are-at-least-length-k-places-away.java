class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c = k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(c<k)return false;
                c=0;
            }
            else c++;
        }
    return true;
    }
}