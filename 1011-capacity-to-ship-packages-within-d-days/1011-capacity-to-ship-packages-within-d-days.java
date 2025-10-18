class Solution {
    public static boolean canShip(int[] weights, int days, long mid){
        int c = 0;
        long sum = 0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum==mid){
                c++;
                sum=0;
            }
            else if(sum>mid){
                c++;
                sum=weights[i];
            }
        }
        if(sum!=0)c++;
    return c<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        long sum=0;
        long max = Integer.MIN_VALUE;
        for(int k=0;k<weights.length;k++){
            sum+=weights[k];
            max=Math.max(max,weights[k]);
        }
        long i=max;
        long j=sum;
        int ans = 0;
        while(i<=j){
            long mid = i+(j-i)/2;
            if(canShip(weights,days,mid)){
                ans = (int)mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
}