class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int c=0;
        int max=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1))c++;
            else c=0;
            max = Math.max(max,c);
        }
    return max+1;
    }
}