class Solution {
    public int maximum69Number (int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int j = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6'){
                j=i;
                break;
            }
            
        }
        if(j==-1)return num;
        s.setCharAt(j,'9');
        num = Integer.parseInt(s.toString());
        return num;
    }
}