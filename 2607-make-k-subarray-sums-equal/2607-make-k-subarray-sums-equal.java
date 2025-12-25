class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
         int n = arr.length;
        int g = gcd(n, k);
        long cost = 0;

        for(int i=0;i<g;i++) {
            ArrayList<Integer> cycle = new ArrayList<>();
            int j = i;

            while(true){
                cycle.add(arr[j]);
                j = (j + k) % n;
                if (j == i) break;
            }

            Collections.sort(cycle);
            int median = cycle.get(cycle.size() / 2);

            for (int x : cycle) {
                cost += Math.abs(x - median);
            }
        }
        return cost;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}