class Solution {
    public boolean isPerfectSquare(int num) {
        int i=0;
        int j=num/2;
        if(num==1)return true;
        while(i<=j){
            long mid = i+(j-i)/2;
            long sq = mid*mid;
            if(sq==num)return true;
            if(sq<num){
                i=(int)mid+1;
            }
            else{
                j=(int)mid-1;
            }
        }
    return false;
    }
}