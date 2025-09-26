class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n = nums.length;
        // int c = 0;
        // int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k)c++;
        //     }
        // }
        // return c;
        HashMap<Integer,Integer> map  = new HashMap<>();
        map.put(0,1);
        int c=0,s=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(map.containsKey(s-k))c+=map.get(s-k);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return c;
    }
}