class Solution {
    public static int topo(int n,List<List<Integer>> adj,int[] in){
         Queue<Integer> q = new LinkedList<>();

        for(int i= 0; i < n; i++){
            if (in[i] == 0) {
                q.add(i);
            }
        }
         int count = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int nbr : adj.get(node)) {
                in[nbr]--;
                if (in[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }
        return count;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] in = new int[numCourses];
        for(int[] p :  prerequisites){
            int a = p[1];
            int b = p[0];
            adj.get(a).add(b);
            in[b]++;
        }
        int t = topo(numCourses,adj,in);
        return t == numCourses;
    }
}