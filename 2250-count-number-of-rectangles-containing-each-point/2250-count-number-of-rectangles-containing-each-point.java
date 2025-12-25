class Solution {
    public int binarySearch(List<Integer> l, int target){
        int lo = 0;
        int hi = l.size() - 1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(l.get(mid)>=target){
                hi = mid - 1;
            } 
            else{
                lo = mid + 1;
            }
        }
        return lo;
    };
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for (int rectangle[] : rectangles) {
            int x = rectangle[0];
            int y = rectangle[1];
            List<Integer> l = hm.get(y);
            if(l==null){
                l = new ArrayList<>();
            }
            l.add(x);
            hm.put(y,l);
        }

        List<Integer> ys = new ArrayList<>();
        ys.addAll(hm.keySet());
        Collections.sort(ys);

        for(Integer y : ys){
            List<Integer> l = hm.get(y);
            Collections.sort(l);
            hm.put(y,l);
        }

        int idx = 0;
        int result[] = new int[points.length];
        for (int []point : points) {
            int x = point[0];
            int total = 0;
            for (int key=binarySearch(ys,point[1]);key<ys.size();key++) {
                List<Integer> l = hm.get(ys.get(key));
                total += l.size() - binarySearch(l,x);
            }
            result[idx++] = total;
        }
        return result;
    }
}