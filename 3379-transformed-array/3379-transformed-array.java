class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int num = nums[i];
                num = num%n;
                int j=i;
                j += num;
                ans[i] = nums[j%n];
            }
            else{
                int num = nums[i]*-1;
                num = num%n;
                int j=i;
                j -= num;
                if(j<0){
                    ans[i] = nums[n+j];
                }
                else ans[i] = nums[j];
            }
        }
    return ans;
    }
}