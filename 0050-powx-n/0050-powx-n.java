class Solution {
    public static double power(double x, long n){
        double ans = 1.0;
        while(n>0){
            if(n%2==0){
                x = x*x;
                n /= 2;
            }
            else{
                ans = ans*x;
                n -= 1;
            }
        }
    return ans;
    }
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            x = 1/x;
            N = N*-1;
        }
    return power(x,N);
    }
}