class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int e : prices){
            min = Math.min(min,e);
            max = Math.max(max,e-min);
        }
    return max;
    }
}