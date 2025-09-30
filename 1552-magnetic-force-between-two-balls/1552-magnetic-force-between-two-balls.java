
class Solution {
    public static boolean arrange(int[] arr,int j,int k){
        int c=1;
        int x=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-x>=k){
                c++;
                x=arr[i];
            }
            
        }
        if(c>=j)return true;
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int f=1;
        int l=position[n-1]-position[0];
        int ans = 0;
        while(f<=l){
            int mid = f+(l-f)/2;
            if(arrange(position,m,mid)){
                ans = mid;
                f=mid+1;
            }
            else l=mid-1;
        }
        return ans;
    }
}