class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] f = new int[2];
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)f[0]++;
            else if(bills[i]==10){
                f[1]++;
                if(f[0]>0){
                    f[0]--;
                }
                else return false;
            }
            else{
                if(f[0]>0 && f[1]>0){
                    f[0]--;
                    f[1]--;
                }
                else if(f[0]>2){
                    f[0]-=3;
                }
                else return false;
            }
        }
        return true;
    }
}