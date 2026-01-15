class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int rev =0;
        while(x>0){
            int rem = x%10;
            x=x/10;
            rev = rev*10+rem;
        }
        if(y==rev){return true;}
        else{return false;}
    }
    
}