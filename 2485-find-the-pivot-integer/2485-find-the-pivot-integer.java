class Solution {
    public int pivotInteger(int n) {
        int i=0;
        int j=n;
        int ans = -1;
        int total = n*(n+1)/2;
        while(i<=j){
            int mid = i+(j-i)/2;
            int s = mid*(mid+1)/2;
            if(s==total+mid-s){
                ans = mid;
                break;
            }
            else if(s<total+mid-s)i=mid+1;
            else j=mid-1;
        }
    return ans;
    }
}