class Solution:
    def evalRPN(self, tokens):
        st = []
        for t in tokens:
            if t in "+-*/":
                a = st.pop()
                b = st.pop()
                if t == "+":
                    st.append(b + a)
                elif t == "-":
                    st.append(b - a)
                elif t == "*":
                    st.append(b * a)
                else:
                    st.append(int(b / a))  # truncates toward zero
            else:
                st.append(int(t))
        return st[-1]