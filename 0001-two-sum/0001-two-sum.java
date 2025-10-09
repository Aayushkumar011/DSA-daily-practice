class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int e = -1;
        for(int i=0;i<nums.length;i++){
            e=target-nums[i];
            if(set.contains(e)){
                arr[1]=i;
                break;
            }
            set.add(nums[i]);
        }
        for(int i=0;i<arr[1];i++){
            if(e==nums[i])arr[0]=i;
        }
    return arr;
    }
}