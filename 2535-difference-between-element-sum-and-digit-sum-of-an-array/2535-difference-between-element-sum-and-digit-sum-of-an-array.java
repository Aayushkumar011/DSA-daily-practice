class Solution {
    public int differenceOfSum(int[] nums) {
        int es = 0;
        int ds = 0;
        for(int n : nums){
            es += n;
            while(n>0){
                int rem = n%10;
                ds += rem;
                n /= 10;
            }
        }
    return es-ds;
    }
}