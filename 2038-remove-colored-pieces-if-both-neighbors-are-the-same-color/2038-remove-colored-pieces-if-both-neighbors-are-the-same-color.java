class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        if(n<=2)return false;
        int alice = 0;
        int bob = 0;
        for(int i=1;i<n-1;i++){
            if(colors.charAt(i)=='A'){
                if(colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A')alice++;
            }
            else{
                if(colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B')bob++;
            }
        }
        if(alice>bob)return true;
        else return false;
    }
}