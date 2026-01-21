class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        int[] ans = new int[2];
        while(i<nums.length){
            if(set.contains(target-nums[i])){
                ans[1]=i;
                break;
            }
            else set.add(nums[i]);
            i++;
        }
        int j=0;
        while(j<i){
            if(nums[j]==target-nums[i]){
                ans[0]=j;
                break;
            }
            j++;
        }
    return ans;
    }
}