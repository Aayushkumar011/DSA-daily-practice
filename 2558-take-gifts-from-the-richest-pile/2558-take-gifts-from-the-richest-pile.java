class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        for(int n:gifts){
            heap.add(n);
        }
        while(k-- > 0){
            int a = heap.poll();
            heap.add((int)(Math.sqrt(a)));
        }
        long sum = 0;
        while(!heap.isEmpty()){
            sum+=heap.poll();
        }
        return sum;
    }
}