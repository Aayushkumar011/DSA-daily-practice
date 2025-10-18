class Solution {
    public static boolean canEat(int mid,long h,int[] piles){
        long val = 0;
        for(int i=0;i<piles.length;i++){
            val+= (long)(mid+piles[i]-1)/mid;
        }
    return val<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = Integer.MIN_VALUE;
        for(int k=0;k<piles.length;k++){
            j=Math.max(j,piles[k]);
        }
        int ans = -1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(canEat(mid,h,piles)){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
}