class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i))stack.pop();
            else stack.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
    return str.reverse().toString();
    }
}