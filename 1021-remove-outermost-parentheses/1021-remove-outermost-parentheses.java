class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int c = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                str.append('(');
                c++;
            }
            else if(s.charAt(i)==')' && c>0){
                str.append(")");
                c--;
            }
            else if(s.charAt(i)==')' && c==0){
                st.pop();
            }
        }
    return str.toString();
    }
}