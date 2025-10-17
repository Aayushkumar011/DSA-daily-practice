class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int min = nums[i+(j-i)/2];
        while(i<=j){
            int mid = i+(j-i)/2;
            if(min>nums[mid])min=nums[mid];
            if(nums[j]<=nums[mid]){
                i=mid+1;
            }
            else j=mid-1;
        }
    return min;
    }
}