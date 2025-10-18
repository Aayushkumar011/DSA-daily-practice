class Solution {
    public static int Miss(int[] arr, int k, int mid){
        int lower = -1;
        int i=0;int j=arr.length-1;
        int ans = 0;
        while(i<=j){
            int m = i+(j-i)/2;
            if(arr[m]<=mid){
                ans=m;
                i=m+1;
            }
            else j=m-1;
        }
    return ans+1;
    }
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        int max=Integer.MAX_VALUE;
        for(int l=0;l<arr.length;l++){
            max=Math.max(max,arr[l]);
        }
        int j=max;
        while(i<=j){
            int mid = i+(j-i)/2;
            int miss = Miss(arr, k, mid);
            if(mid-miss==k){
                return mid;
            }
            else if(mid-miss>k){
                j=mid-1;
            }
            else i=mid+1;
        }
    return -1;
    }
}