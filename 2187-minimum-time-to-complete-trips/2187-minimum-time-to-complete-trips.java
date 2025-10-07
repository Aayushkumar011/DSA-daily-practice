class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int maxTime = time[0];
        for (int i = 1; i < time.length; i++) {
            if (time[i] > maxTime) {
                maxTime = time[i];
            }
        }

        // Binary search range
        long ans =0;
        long left = 1;
        long right = (long) maxTime * totalTrips;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long trips = 0;
            for (int t : time) {
                trips += mid / t; // number of trips this bus can make
            }

            if (trips >= totalTrips) {
                ans=mid;
                right = mid; // try to find smaller time
            } else {
                left = mid + 1; // need more time
            }
        }

        return right;
    }
}
