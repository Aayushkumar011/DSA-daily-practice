class Solution {
    public static void first(int[] nums, int target, int[] arr){
        int f = 0;
        int l = nums.length-1;
        while(f<=l){
            int mid = f+(l-f)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                l=mid-1;
            }
            else if(nums[mid]>target){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
    }
    public static void last(int[] nums, int target, int[] arr){
        int f = 0;
        int l = nums.length-1;
        while(f<=l){
            int mid = f+(l-f)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                f=mid+1;
            }
            else if(nums[mid]>target){
                l=mid-1;
            }
            else{
                f=mid+1;
            }
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        first(nums,target,arr);
        last(nums,target,arr);
        return arr;
    }
}