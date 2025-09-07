class Solution {
    public String defangIPaddr(String address) {
        String[] s = address.split("\\.");
        StringBuilder str = new StringBuilder();
        str.append(s[0]);
        for(int i=1;i<s.length;i++){
            str.append("[.]");
            str.append(s[i]);
        }
    return str.toString();
    }
}