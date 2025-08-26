class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Set<Integer> s = new HashSet<>();
        heap.add(1);
        int c=0;
        while(!heap.isEmpty()){
            int ele = heap.poll();
            if(!s.contains(ele)){
                heap.add(ele*2);
                heap.add(ele*3);
                heap.add(ele*5);
                s.add(ele);
                c++;

            }
            if(c==n){
                c=ele;
                break;
            }
        }
        return c;
    }
}