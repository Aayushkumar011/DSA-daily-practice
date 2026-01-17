class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int pre = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=pre){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                pre=temp;
            }
        }
    return j;
    }
}