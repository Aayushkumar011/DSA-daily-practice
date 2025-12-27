class Solution {
    public String resultingString(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty()) {
                char top = st.peek();
                if (((top == 'z' && ch == 'a') || (top == 'a' && ch == 'z')) || (Math.abs((int) (ch - top)) == 1))
                    st.pop();
                else
                    st.push(ch);
            } else
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}