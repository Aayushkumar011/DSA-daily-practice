class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int c=0;
        for(int i=0;i<=n-3;i++){
            if(nums[i]==0){
                c++;
                if(nums[i+1]==0)nums[i+1]=1;
                else nums[i+1]=0;
                if(nums[i+2]==0)nums[i+2]=1;
                else nums[i+2]=0;
            }
        }
        if(nums[n-1]==0 || nums[n-2]==0)return -1;
        else return c;
    }
}