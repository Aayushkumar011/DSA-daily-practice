class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int m = people.length;
        int[] start = new int[n];
        int[] end = new int[n];
        int[] ans = new int[m];
        for(int i=0;i<n;i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0;i<m;i++){
            int p = people[i];
            int a = started(start,p);
            int b = ended(end,p);
            ans[i]=a-b;
        }
        return ans;
    }
    public static int started(int[] arr,int t){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]<=t)i=mid+1;
            else j=mid-1;
        }
        return i;
    }
    public static int ended(int[] arr,int t){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]<t)i=mid+1;
            else j=mid-1;
        }
        return i;
    }
}