class Solution {
    public static void help(int[] arr,List<List<Integer>> ans,int k, int n,int i,int sum,List<Integer> a){
        if(a.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(a));
            }
            return;
        }
        if(i>=arr.length || sum>n)return;
        if(a.size()>k)return;
        help(arr,ans,k,n,i+1,sum,a);
        a.add(arr[i]);
        help(arr,ans,k,n,i+1,sum+arr[i],a);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        help(arr,ans,k,n,0,0, new ArrayList<>());
    return ans;
    }
}