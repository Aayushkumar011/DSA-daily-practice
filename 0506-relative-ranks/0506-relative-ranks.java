class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            heap.add(new int[]{score[i],i});
        }
        int j=1;
        while(!heap.isEmpty()){
            int[] arr = heap.poll();
            if(j==1){
                ans[arr[1]] = "Gold Medal";
            }
            else if(j==2){
                ans[arr[1]] = "Silver Medal";
            }
            else if(j==3){
                ans[arr[1]] = "Bronze Medal";
            }
            else{
                ans[arr[1]] = String.valueOf(j);

            }
            j++;
        }
    return ans;
    }
}