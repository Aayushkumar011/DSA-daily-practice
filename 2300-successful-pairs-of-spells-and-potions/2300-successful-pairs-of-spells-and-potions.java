class Solution {
    public static int search( int[] potions,long k, long success){
        int i=0;
        int j=potions.length-1;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(potions[mid]*k>=success){
                ans=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
    return ans;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int k = (search(potions,(long)spells[i],success));
            if(k==0)ans[i]=0;
            else ans[i]=m-k;
        }
        return ans;
    }
}