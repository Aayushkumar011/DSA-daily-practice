class Solution {
    public static void help(char[] nums,String[] arr,List<String> ans,int idx,String s){
        if(idx>=nums.length){
            ans.add(s);
            return;    
        }
        if(s.length()>nums.length)return;
        char ch = nums[idx];
        String str = arr[ch-'0'];
        for(int i=0;i<str.length();i++){
            help(nums,arr,ans,idx+1,s+str.charAt(i));     
        }
    }
    public List<String> letterCombinations(String s) {
        List<String> ans = new ArrayList<>();
        String[] arr = new String[10];
        arr[2] = "abc";
        arr[3] = "def";
        arr[4] = "ghi";
        arr[5] = "jkl";
        arr[6] = "mno";
        arr[7] = "pqrs";
        arr[8] = "tuv";
        arr[9] = "wxyz";
        char[] nums = s.toCharArray();
        help(nums,arr,ans,0,"");
    return ans;
    }
}