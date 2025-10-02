class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int j=0;
        HashSet<Integer> set = new HashSet<>();
        int[] f = new int[n+1];
        int ans = 0;
        for(int i=0;i<fruits.length;i++){
            f[fruits[i]]++;
            set.add(fruits[i]);
            while(set.size()>2){
                f[fruits[j]]--;
                if(f[fruits[j]]==0)set.remove(fruits[j]);
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}