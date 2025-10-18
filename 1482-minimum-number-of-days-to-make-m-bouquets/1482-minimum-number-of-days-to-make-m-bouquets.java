class Solution {
    public static boolean canMake(int[] bloomDay, int m, int k, int mid){
        int count=0;
        int c=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                c++;
                if(c==k){
                    count++;
                    c=0;
                }
            }
            else c=0;
        }
        return count>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int i=Integer.MAX_VALUE;
        int j=Integer.MIN_VALUE;
        for(int l=0;l<bloomDay.length;l++){
            i=Math.min(i,bloomDay[l]);
            j=Math.max(j,bloomDay[l]);
        }
        if((long)m*k>n)return -1;
        int ans = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
}