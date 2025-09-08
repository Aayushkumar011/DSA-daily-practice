class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c = 0;
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target)c++;
                else break;
            }
        }
    return c;
    }
}