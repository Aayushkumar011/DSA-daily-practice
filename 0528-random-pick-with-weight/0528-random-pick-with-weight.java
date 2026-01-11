class Solution {
    private int[] prefix;
    private Random rand;
    private int total;
    public Solution(int[] w) {
        prefix = new int[w.length];
        rand = new Random();
        int sum = 0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            prefix[i]=sum;
        }
        total = sum;
    }
    
    public int pickIndex() {
        int r = rand.nextInt(total) + 1;
        int left = 0, right = prefix.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] < r) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */