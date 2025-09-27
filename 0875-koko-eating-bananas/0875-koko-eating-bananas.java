class Solution {
    public static boolean canEat(int[] piles, int h, double m){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+= (int)Math.ceil(piles[i]/m);
            if(sum>h)return false;
        }
        return h>=sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int f = 0;
        int n = piles.length;
        for(int i=0;i<n;i++){
            f=Math.max(f,piles[i]);
        }
        while(s<=f){
            int mid = s+(f-s)/2;
            if(canEat(piles,h,mid)){
                f=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}