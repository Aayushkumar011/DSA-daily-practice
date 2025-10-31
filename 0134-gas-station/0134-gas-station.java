class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int index=0;
        int fule=0;
        int total_fule=0;
        int total_cost=0;
        int c=0;
        for(int i=0;i<n;i++){
            total_fule+=gas[i];
            total_cost+=cost[i];
           fule+=gas[i];
           fule-=cost[i];
           if(fule<0){
            index=i+1;
            fule=0;
           }
        }
    return total_fule>=total_cost?index:-1;
    }
}