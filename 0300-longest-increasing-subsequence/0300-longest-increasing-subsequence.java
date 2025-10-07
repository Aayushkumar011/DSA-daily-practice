class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        ans.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]>ans.get(ans.size()-1)){
                ans.add(nums[i]);
                continue;
            }
            int f=0;
            int j=ans.size()-1;
            int k=0;
            while(f<=j){
                int mid = f+(j-f)/2;
                if(ans.get(mid)>=nums[i]){
                    k=mid;
                    j=mid-1;
                }
                else f=mid+1;
            }
            ans.set(k,nums[i]);
        }
        return ans.size();
    
    }
}