class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007;
        long RYR = 6;
        long RYG = 6;
        for(int i=2;i<=n;i++){
            long newRYR = (3*RYR + 2*RYG)%mod;
            long newRYG = (2*RYR + 2*RYG)%mod;
            RYR = newRYR;
            RYG = newRYG;
        }
    return (int)((RYR + RYG)%mod);
    }
}