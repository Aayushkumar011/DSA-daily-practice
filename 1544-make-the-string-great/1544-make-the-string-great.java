class Solution {
    public String makeGood(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()-s.charAt(i)==32){
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}