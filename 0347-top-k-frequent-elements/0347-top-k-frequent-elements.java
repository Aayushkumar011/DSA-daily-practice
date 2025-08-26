class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> Heap = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int ele = e.getKey();
            int val = e.getValue();
            Heap.add(new int[]{ele,val});
            if(Heap.size()>k){
                Heap.poll();
            }
        }
        int[] ans = new int[k];
        int i=0;
        while(!Heap.isEmpty()){
            ans[i] = Heap.poll()[0];
            i++;
        }
    return ans;
    }
}