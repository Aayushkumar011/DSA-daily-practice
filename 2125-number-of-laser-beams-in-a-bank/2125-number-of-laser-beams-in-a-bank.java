class Solution {
    public static int helper(String s){
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
    return c;
    }
    public int numberOfBeams(String[] bank) {
        int mul = 0;
        int sum = 0;
        for(int i=0;i<bank.length;i++){
            int c = helper(bank[i]);
            if(mul!=0 && c!=0 && i!=0){
                sum += mul*c;
                mul = c;
            }
            else if(c!=0){
                mul=c;
            }
        }
    return sum;
    }
}