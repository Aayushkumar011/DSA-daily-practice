class Solution {
    public static boolean divided(int[] nums, int k, int m){
        int c=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m)return false;
            if(sum+nums[i]>m){
                c++;
                sum=nums[i];
            }
            else sum+=nums[i];
        }
    return c<=k;
    }
    public int splitArray(int[] nums, int k) {
        int i=0;
        int sum=0;
        for(int l=0;l<nums.length;l++){
            sum+=nums[l];
        }
        int j=sum;
        int ans=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(divided(nums,k,mid)){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
}