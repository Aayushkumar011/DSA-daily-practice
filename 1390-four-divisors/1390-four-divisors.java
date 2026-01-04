class Solution {
    public static int factor(int n){
        int s = n+1;
        int c = 2;
        int i = 2;
        int j = n/2;
        while(i<j){
            if(n%i==0){
                c+=2;
                s+=i;
                s+=j;
            }
            i++;
            j=n/i;
            if(c>4)return 0;
        }
    if(c==4)return s;
    else return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += factor(nums[i]);
        }
    return sum;
    }
}