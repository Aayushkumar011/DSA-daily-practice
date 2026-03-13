class Solution {
    public static void find(char[] arr,int t,int n,int ind,long res,long prev,List<String> ans,String s){
        if(ind>=n){
            if(res==t){ 
                ans.add(s);
            }
        return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && arr[ind]=='0')break;
            long num = Long.parseLong(new String(arr, ind, i-ind+1));
            if(ind==0){
                find(arr,t,n,i+1,num,num,ans,s+num);
            }
            else{
                find(arr,t,n,i+1,res+num,num,ans,s+"+"+num);
                find(arr,t,n,i+1,res-num,-num,ans,s+"-"+num);
                find(arr,t,n,i+1,res-prev+prev*num,prev*num,ans,s+"*"+num);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        char[] arr = num.toCharArray();
        find(arr,target,arr.length,0,0,0,ans,"");
    return ans;
    }
}