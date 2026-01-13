class Solution {
    public int largestPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) isPrime[i] = true;
        isPrime[0] = isPrime[1] = false;
        
        for (int j = 4; j <= n; j += 2) isPrime[j] = false;
        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += 2 * i) isPrime[j] = false;
            }
        }
        
        long sum = 0;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
                if (sum > n) break;
                if (isPrime[(int)sum]) ans = (int)sum;
            }
        }
        return ans;
    }
}