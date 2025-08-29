class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        StringBuilder s = new StringBuilder();
        while(l1>=0 && l2>=0){
            int n1 = a.charAt(l1)-'0';
            int n2 = b.charAt(l2)-'0';
            int num = n1+n2+c;
            s.append(num%2);
            c=num/2;
            l1--;
            l2--;
        }
        while(l1>=0){
            int n1 = a.charAt(l1)-'0';
            int num = n1+c;
            s.append(num%2);
            c=num/2;
            l1--;
        }
        while(l2>=0){
            int n2 = b.charAt(l2)-'0';
            int num = n2+c;
            s.append(num%2);
            c=num/2;
            l2--;
        }
        if(c==1) s.append(c);
    return s.reverse().toString();
    }
}