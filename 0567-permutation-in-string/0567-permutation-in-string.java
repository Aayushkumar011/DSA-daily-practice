class Solution {
    public static boolean helper(String s1,String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i])return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int w = s1.length();
        int l = s2.length();
        int n = l-w+1;
        for(int i=0;i<n;i++){
            if(helper(s1,s2.substring(i,w+i)))return true;
        }
    return false;
    }
}