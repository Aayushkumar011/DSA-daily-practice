class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int k = nums.length/3;
        // for(int i : map.values()){
        //     if(i>=k){
        //         ans.add(map.getKey(i));
        //     }
        // }
        for(int i : map.keySet()){
            if(map.get(i)>k){
                ans.add(i);
            }
        }
    return ans;
    }
}