class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n+1];
        int c=1;
        for(int i=n-1;i>=0;i--){
            digits[i]+=c;
            if(digits[i]>9){
                ans[i+1]=0;
            }
            else {
                c=0;
                ans[i+1]=digits[i];
            }
        }
    if(c==0){
        int[] result = Arrays.copyOfRange(ans,1,n+1);
        return result;
        }
    else ans[0]=1;
    return ans;
    }
}