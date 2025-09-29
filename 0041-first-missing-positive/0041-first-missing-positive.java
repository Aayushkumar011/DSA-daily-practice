class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        for (int x : nums) {
            if (x > 0 && x <= n) {
                present[x] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
              
            }
        }
        return n + 1;
    }
}