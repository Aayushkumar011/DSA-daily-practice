class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        int i=0;
        int j=n-1;
        while(j>i){
            int num = arr[i][0]+arr[j][0];
            if(num==target){
                return new int[]{arr[i][1],arr[j][1]};
            }
            else if(num>target)j--;
            else i++;
        }
    return new int[]{};
    }
}