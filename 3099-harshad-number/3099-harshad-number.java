class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int ans = -1;
        int sum = 0;
        int y = x;
        while(y>0){
            int rem = y%10;
            sum += rem;
            y/=10;
        }
        if(x%sum==0)ans=sum;
        return ans;
    }
}