class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x<0){
            flag = true;
            x=-1*x;
        }
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem;
            x=x/10;
        }
        if(flag)rev = -1*rev;
    return rev;
    }
}