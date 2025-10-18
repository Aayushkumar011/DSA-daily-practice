class Solution {
    public static boolean canThreshold(int[] nums, int threshold, int m){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(m+nums[i]-1)/m;
        }
    return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int i=1;
        int j=Integer.MIN_VALUE;
        for(int k=0;k<nums.length;k++){
            j=Math.max(j,nums[k]);
        }
        int ans=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(canThreshold(nums,threshold,mid)){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
}