class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int cnt = 0; 

        if (k == 1) {
            return nums;
        }
        
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                cnt++;
            } 
            else {
                cnt = 0;
            }

            if(i>=k-1){
                if(cnt>=k-1){
                    ans[i-k+1] = nums[i];
                } 
                else {
                    ans[i-k+1] = -1;
                }
            }
        }
        return ans;
    }
}

    
