class Solution {
    static boolean[] seen = new boolean[8];
    static int n;
    static int ans;

    public int findMinimumTime(List<Integer> strength, int k) {
        n = strength.size();
        ans = Integer.MAX_VALUE;
        dfs(strength, 1, k, 0, 0);
        return ans;
    }

    void dfs(List<Integer> arr, int x, int k, int time, int cnt){
        if(time >= ans)return;
        if(cnt == n){
            ans = Math.min(ans, time);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(seen[i])continue;
            seen[i] = true;
            int curr = arr.get(i);
            int need = curr/x;
            if(curr % x != 0)need++;
            dfs(arr, x+k, k, time+need, cnt+1);
            seen[i] = false;
        }
    }
}