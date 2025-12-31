class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();

        int[][] maxHealth = new int[n][m];
        for (int[] row : maxHealth)
            Arrays.fill(row, -1);

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, health});
        maxHealth[0][0] = health;

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int i = cur[0], j = cur[1], h = cur[2];

            if (grid.get(i).get(j) == 1) h--;
            if (h <= 0) continue;

            if (i == n - 1 && j == m - 1) return true;

            for (int[] d : dir) {
                int ni = i + d[0];
                int nj = j + d[1];

                if (ni >= 0 && nj >= 0 && ni < n && nj < m) {
                    if (h > maxHealth[ni][nj]) {
                        maxHealth[ni][nj] = h;
                        q.offer(new int[]{ni, nj, h});
                    }
                }
            }
        }
        return false;
    }
}
