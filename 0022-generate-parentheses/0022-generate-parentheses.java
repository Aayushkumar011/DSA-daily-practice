class Solution {
    public static boolean balanced(String s){
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                c++;
            }
            else if(ch==')' && c>0){
                c--;
            }
            else return false;
        }
    return c==0;
    }
    public static void helper( List<String> ans,String s,int n){
        if(s.length()==n){
            if(balanced(s))ans.add(s);
            return;
        }
        helper(ans,s+"(",n);
        helper(ans,s+")",n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",n*2);
    return ans;
    }
}