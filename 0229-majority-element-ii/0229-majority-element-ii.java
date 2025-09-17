class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int n = nums.length/3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > n) {
                l.add(entry.getKey());
            }
        }
        return l;
    }
}