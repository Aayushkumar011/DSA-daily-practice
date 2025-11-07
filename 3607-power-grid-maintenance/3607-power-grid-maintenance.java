import java.util.*;

class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        DSU dsu = new DSU(c + 1);

        // Build DSU
        for (int[] e : connections)
            dsu.union(e[0], e[1]);

        // Map root -> TreeSet of online nodes
        Map<Integer, TreeSet<Integer>> grid = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int root = dsu.find(i);
            grid.computeIfAbsent(root, k -> new TreeSet<>()).add(i);
        }

        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        List<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0], x = q[1];
            int root = dsu.find(x);

            if (type == 1) { // maintenance check
                if (online[x]) {
                    result.add(x);
                } else {
                    TreeSet<Integer> set = grid.get(root);
                    if (set == null || set.isEmpty()) result.add(-1);
                    else result.add(set.first());
                }
            } else { // type == 2, go offline
                if (online[x]) {
                    online[x] = false;
                    TreeSet<Integer> set = grid.get(root);
                    if (set != null) set.remove(x);
                }
            }
        }

        // Convert to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);
        return ans;
    }

    // ---------- DSU ----------
    static class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int a, int b) {
            int pa = find(a), pb = find(b);
            if (pa == pb) return;
            if (rank[pa] < rank[pb]) parent[pa] = pb;
            else if (rank[pb] < rank[pa]) parent[pb] = pa;
            else {
                parent[pb] = pa;
                rank[pa]++;
            }
        }
    }
}
