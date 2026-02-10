class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            HashSet<Integer> e_set = new HashSet<>();
            HashSet<Integer> o_set = new HashSet<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    e_set.add(nums[j]);
                }
                else o_set.add(nums[j]);
                
                if(e_set.size()==o_set.size()){
                    max = Math.max(max,j-i+1);
                }
            }
        }
    return max;
    }
}