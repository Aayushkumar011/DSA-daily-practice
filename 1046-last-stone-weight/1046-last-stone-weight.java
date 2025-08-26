class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        int n = stones.length;
        for(int i=0;i<n;i++){
            heap.add(stones[i]);
        }
        while(heap.size()>1){
            int a = heap.poll();
            int b = heap.poll();
            if(a>b){
                heap.add(a-b);
            }
            else if(b>a){
                heap.add(b-a);
            }
        }
        if(heap.isEmpty()) return 0;
        return heap.poll();
    }
}