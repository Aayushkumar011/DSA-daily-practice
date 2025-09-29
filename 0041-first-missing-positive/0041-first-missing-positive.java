class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x>0){
                set.add(x);
            }
        }
        int n = nums.length;
        for (int i=1;i<=n+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return n + 1;
    }
}