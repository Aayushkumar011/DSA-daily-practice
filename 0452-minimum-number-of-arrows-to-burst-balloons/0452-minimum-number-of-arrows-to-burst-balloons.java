class Solution {

    public int findMinArrowShots(int[][] points) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
        if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
        return Integer.compare(a[1], b[1]);
        });
        for(int[] arr : points){
            heap.add(arr);
        }
        int arrow = 1;
        int[] a = heap.poll();
        int start = a[0];
        int end = a[1];
        while(!heap.isEmpty()){
            a = heap.poll();
            if(a[0]>end){
                arrow++;
                start = a[0];
                end = a[1];
            }
             else {
                // overlap → shrink the interval
                start = Math.max(start, a[0]);
                end = Math.min(end, a[1]);
            }
        }
        return arrow;
    }
}