class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] arr = new int[101];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            arr[i]= arr[i]+arr[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0)ans[i]=0;
            else ans[i] = arr[nums[i]-1];
        }
    return ans;
    }
}