class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int l = 1;
        int w = 1;
        int cl = 1;
        int cw = 1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i]-hBars[i-1]==1){
                cl++;
            }
            else{
                cl=1;
            }
            l = Math.max(l,cl);
        }
        for(int i=1;i<vBars.length;i++){
            if(vBars[i]-vBars[i-1]==1){
                cw++;
            }
            else{
                cw=1;
            }
            w = Math.max(w,cw);
        }
        int ans = Math.min(l,w) + 1;
    return ans*ans;
    }
}