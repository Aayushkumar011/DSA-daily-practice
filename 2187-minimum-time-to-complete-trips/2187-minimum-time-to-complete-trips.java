class Solution {
    public static boolean completed(int[] time, long m, int totalTrips){
        long sum = 0;
        for(int i=0;i<time.length;i++){
            if(time[i]<=m){
                sum+=m/time[i];
            }
            else break;
        }
    return sum>=totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long s = 1;
        long e = 0;
        Arrays.sort(time);
        for(int i=0;i<time.length;i++){
            e=Math.max(e,time[i]);
        }
        e=e*totalTrips;
        long ans = 0;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(completed(time,mid,totalTrips)){
                ans = mid;
                e=mid-1;
            }
            else s=mid+1;
        }
    return ans;
    }
}