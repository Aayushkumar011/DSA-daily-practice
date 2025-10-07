class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m==0 || m>n)return -1;
        char[] arr = haystack.toCharArray();
        String s=haystack.substring(0,m);
        if(s.equals(needle))return 0;
        for(int i=m;i<n;i++){
            s=haystack.substring((i-m)+1,i+1);
            if(s.equals(needle))return (i-m)+1;
        }
    return -1;
    }
}