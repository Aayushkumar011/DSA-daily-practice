class Solution {
    public static boolean delivered(int[] weights, int days, int m){
        int c=0;
        int sum=0;
        for(int e:weights){
            sum+=e;
            if(sum>m){
                c++;
                sum=e;
            }
        }
        c++;
        return c<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        int ans=0;
        for(int e:weights) {
            l = Math.max(l,e); 
            r += e;           
        }
        while(l<=r){
            int mid = l+(r-l)/2;
            if(delivered(weights,days,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}