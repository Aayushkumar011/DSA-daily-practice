class Solution {
    public int numWays(String s) {
        int n = s.length();
        long ones = 0;
        final int MOD = 1_000_000_007;

        for(char ch : s.toCharArray()){
            if (ch == '1') ones++;
        }

        if(ones == 0){
            long ways = (long)(n - 1)*(n - 2)/2;
            return (int)(ways % MOD);
        }

        if(ones % 3 != 0) return 0;

        long part = ones / 3;
        long first = 0, second = 0;
        long curr = 0;

        for(char ch : s.toCharArray()){
            if (ch == '1') curr++;

            if (curr == part) first++;
            else if(curr == 2 * part)second++;
        }

        return (int)((first * second) % MOD);
    }
}
