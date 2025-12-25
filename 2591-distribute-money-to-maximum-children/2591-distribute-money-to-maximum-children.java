class Solution {
    public int distMoney(int money, int children) {
        if(money/children<1)return -1;
        int c = 0;
        while(children>1){
            if((money-8)/(children-1)>=1){
                c++;
                money -= 8;
                children -= 1;
            }
            else{
                return c;
            }
        }
        if(money==4)return c-1;
        else if(money==8)return c+1;
        else return c;
    }
}