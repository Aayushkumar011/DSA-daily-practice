class Solution {
    public static void rec(int i,List<String> ans,char[] arr){
        if(i==arr.length){
            ans.add(new String(arr));
            return;
        }
        if(Character.isDigit(arr[i])){
            rec(i+1,ans,arr);
        }
        else{
            arr[i] = Character.toLowerCase(arr[i]);
            rec(i+1,ans,arr);

            arr[i] = Character.toUpperCase(arr[i]);
            rec(i+1,ans,arr);    
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        rec(0,ans,arr);
    return ans;
    }
}