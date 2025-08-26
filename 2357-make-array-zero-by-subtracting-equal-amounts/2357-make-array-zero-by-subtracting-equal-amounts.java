class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums){
            if(n!=0){
                heap.add(n);
            }
        }
        int c=0;
        while(!heap.isEmpty()){
            int a = heap.poll();
            List<Integer> temp = new ArrayList<>();
            while (!heap.isEmpty()) {
                int val = heap.poll() - a;
                if (val > 0) temp.add(val);
            }
            heap.addAll(temp);
            c++;
        }
    return c;
    }
}