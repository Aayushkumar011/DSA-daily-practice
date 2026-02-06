class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        int j=0;
        int ans = Integer.MAX_VALUE;
        while(j<n){
            if((long)nums[j]<=(long)k*nums[i]){
                j++;
            }
            else{
                ans = Math.min(ans,n-(j-i));
                i++;
            }
        }
        ans = Math.min(ans,n-(j-i));
        if(ans==Integer.MAX_VALUE)return 0;
    return ans;
    }
}