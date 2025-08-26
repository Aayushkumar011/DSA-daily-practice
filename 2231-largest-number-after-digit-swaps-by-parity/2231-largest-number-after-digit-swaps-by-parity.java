class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b) -> b-a);
        for (char c : arr) {
            int d = c - '0';
            if (d % 2 == 0) even.add(d);
            else odd.add(d);
        }
        int ans = 0;
        for (char c : arr) {
            int d = c - '0';
            if (d % 2 == 0) ans = ans * 10 + even.poll();
            else ans = ans * 10 + odd.poll();
        }
        return ans;
    }
}
