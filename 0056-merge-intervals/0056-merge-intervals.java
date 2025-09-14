class Solution {
    public int[][] merge(int[][] intervals) {
            PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0]-b[0]);
            ArrayList<int[]> ans = new ArrayList<>();
            int n = intervals.length;
            for(int i=0;i<n;i++){
                heap.add(intervals[i]);
            }
            while(!heap.isEmpty()){
                if(heap.size()==1){
                    int[] a = heap.poll();
                    ans.add(a);
                }
                else{
                    int[] a = heap.poll();
                    int[] b = heap.poll();
                    if(a[1]>=b[0]){
                        heap.add(new int[]{Math.min(a[0],b[0]), Math.max(a[1],b[1])});

                    }
                    else{
                        ans.add(a);
                        heap.add(b);
                    }
                }
            }
            int m = ans.size();
            int[][] res = new int[m][2];
            for(int i=0;i<m;i++){
                res[i] = ans.get(i);
            }
    return res;
    }
}