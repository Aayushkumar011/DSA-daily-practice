class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int mul = 1;
        int j = nums.length-1;
        for(int i=0;i<3;i++){
            mul*=nums[j--];
        }
    return mul;
    }
}