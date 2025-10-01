class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int rem = 0;
        while(numBottles>0){
            ans+=numBottles;
            numBottles+=rem;
            rem = numBottles%numExchange;
            numBottles/=numExchange;
        }
        return ans;
    }
}