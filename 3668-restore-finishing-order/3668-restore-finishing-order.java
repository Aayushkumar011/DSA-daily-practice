class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int n = order.length;
        int m = friends.length;
        int j=0;
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            set.add(friends[i]);
        }
        for(int i=0;i<n;i++){
            if(set.contains(order[i])){
                arr[j++]=order[i];
            }
        }
        return arr;
    }
}