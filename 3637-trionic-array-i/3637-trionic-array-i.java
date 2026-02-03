class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 1;
        int n = nums.length;
        int j=i;
        while(i<n){
            if(nums[i]>nums[i-1]){
                i++;
            }
            else break;
        }
        if(j==i)return false;
        else j=i;
        while(i<n){
            if(nums[i]<nums[i-1]){
                i++;
            }
            else break;
        }
        if(j==i)return false;
        else j=i;
        while(i<n){
            if(nums[i]>nums[i-1]){
                i++;
            }
            else break;
        }
        if(j==i) return false; 
    return i==n;
    }
}