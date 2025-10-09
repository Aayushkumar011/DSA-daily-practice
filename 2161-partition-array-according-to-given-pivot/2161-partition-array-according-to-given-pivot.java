class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        int c=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr[j++]=nums[i];
            }
            else if(nums[i]==pivot)c++;
        }
        for(int i=0;i<c;i++){
            arr[j++]=pivot;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                arr[j++]=nums[i];
            }
        }
    return arr;
    }
}