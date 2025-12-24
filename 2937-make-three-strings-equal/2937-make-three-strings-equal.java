class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        int total = a+b+c;
        int co=0;
        while(a>0 && b>0 && c>0){
            if(s1.charAt(co)!=s2.charAt(co) || s1.charAt(co)!=s3.charAt(co)){
                break;
            }
            co++;
            a--;b--;c--;
        }
    if(co==0)return -1;
    else return total-3*co;
    }
}