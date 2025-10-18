class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)max=Math.max(max,arr[i]);
        int l = max+k;
        int[] f = new int[l+1];
        for(int i=0;i<arr.length;i++){
            f[arr[i]]++;
        }
        int j=1;
        while(k>0){
            if(f[j]==0)k--;
            j++;
        }
    return j-1;
    }
}