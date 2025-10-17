class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if((mid==0 || nums[mid-1]!=nums[mid]) && (mid==nums.length-1 || nums[mid+1]!=nums[mid])){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]){
                if((mid-i+1)%2==0){
                    i=mid+1;
                }
                else j=mid-2;
            }
            else{
                if((j-mid+1)%2==0){
                    j=mid-1;
                }
                else i=mid+2;
            }
        }
    return -1;
    }
}