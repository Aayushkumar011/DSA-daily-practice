class Solution {
    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
    return true;
    }
    public static void help(String s,List<List<String>> ans,int ind,List<String> a){
        if(ind>=s.length()){
            ans.add(new ArrayList<>(a));
        return;
        }
        for(int j=ind;j<s.length();j++){
            String str = s.substring(ind,j+1);
            if(palindrome(str)){
                a.add(str);
                help(s,ans,j+1,a);
                a.remove(a.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        help(s,ans,0,new ArrayList<>());
    return ans;
    }
}