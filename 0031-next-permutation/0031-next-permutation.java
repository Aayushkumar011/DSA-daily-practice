class Solution {
    public static void rev(int[] nums ,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int point = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                point = i;
                break;
            }
        }
        if(point==-1)rev(nums,0,n-1);
        else{
        for(int i=n-1;i>point;i--){
            if(nums[i]>nums[point]){
                int temp = nums[i];
                nums[i] = nums[point];
                nums[point] = temp;
                break;
            }
        }
        rev(nums,point+1,n-1);
        }
    }
}