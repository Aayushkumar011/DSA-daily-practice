class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drink = 0;
        int empty=0;
        while(numBottles>0){
            drink+=numBottles;
            empty+=numBottles;
            int full = 0;
            while(empty>=numExchange){
                full++;
                empty-=numExchange;
                numExchange++;
            }
            numBottles=full;
        }
        return drink;
    }
}