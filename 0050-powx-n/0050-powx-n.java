class Solution {
    public double power(double x, long n){
        if(n==0)return 1.0;
        Double ans=power(x,n/2);
        if(n%2==0){
            ans = ans*ans;
        }
        else {ans = x*ans*ans;}
    return ans;
    }
    public double myPow(double x, int n) {
        if(n<0){
            n=-n;
            x=1/x;
        } 
        return power(x,n);  
    }
}
