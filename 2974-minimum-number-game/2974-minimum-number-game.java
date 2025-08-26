class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] arr = new int[nums.length];
        for(int n : nums){
            heap.add(n);
        }
        int j=0;
        while(!heap.isEmpty()){
            int a = heap.poll();
            int b =  heap.poll();
            arr[j++] = b;  
            arr[j++] = a;
        }
    return arr;
    }
}