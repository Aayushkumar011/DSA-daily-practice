class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int c=1;
        int end = points[0][1];
        for(int[] arr : points){
            if(end>=arr[0]){
                end=Math.min(end,arr[1]);
            }
            else{
                c++;
                end=arr[1];
            }
        }
        return c;
    }
}