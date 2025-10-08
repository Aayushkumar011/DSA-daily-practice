class Solution {
    public String addStrings(String num1, String num2) {
        long n1=0;
        long n2=0;
        for(int i=0;i<num1.length();i++){
            n1 = n1*10 + (long)(num1.charAt(i)-'0');
        }
        for(int i=0;i<num2.length();i++){
            n2 = n2*10 + (long)(num2.charAt(i)-'0');
        }
        long sum = n1+n2;
        return Long.toString(sum);
    }
}