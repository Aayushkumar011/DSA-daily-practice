class Solution {
    public String maximumOddBinaryNumber(String s) {
        int l = s.length();
        int one = 0;
        int zero = 0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='1')one++;
            else zero++;
        }
        StringBuilder str = new StringBuilder();
        while(one>1){
            str.append('1');
            one--;
        }
        while(zero>0){
            str.append('0');
            zero--;
        }
        str.append('1');
        return str.toString();
    }
}