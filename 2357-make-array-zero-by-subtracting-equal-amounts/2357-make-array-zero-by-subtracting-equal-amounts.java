class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(n>0) set.add(n);
        }
        return set.size();
    }
}