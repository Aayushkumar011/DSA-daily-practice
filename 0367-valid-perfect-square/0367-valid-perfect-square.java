class Solution {
    public boolean isPerfectSquare(int num) {
        int start=0;
        int end=num/2;
        if(num==1)return true;
        while(start<=end){
            long mid = start+(end-start)/2;
            long n = mid*mid;
            if(n==num)return true;
            else if(n<num){
                start=(int)mid+1;
            }
            else{
                end=(int)mid-1;
            }
        }
        return false;
    }
}