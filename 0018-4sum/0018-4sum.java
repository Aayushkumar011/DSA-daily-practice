class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int l = j+1;
                int r = n-1;
                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==(long)target){
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        ans.add(a);
                        int val1 = nums[l];
                        int val2 = nums[r];
                        while(l<r && val1==nums[l])l++;
                        while(l<r && val2==nums[r])r--;
                    }
                    else if(sum>target)r--;
                    else l++;
                }
            }
        }
    return ans;
    }
}