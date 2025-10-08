class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long[][] arr = new long[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
        }
        Arrays.sort(arr,(a,b)->Long.compare(a[0],b[0]));
        long sum = 0;
        for(long[] a:arr){
            sum+=a[1];
        }
        long half = (sum+1)/2;
        long target = 0;
        long c = 0;
        for(long[] a:arr){
            c+=a[1];
            if(c>=half){
                target=a[0];
                break;
            }
        }
        long ans =0;
        for(long[] a:arr){
            ans+=Math.abs(a[0]-target)*a[1];
        }
        return ans;
    }
}