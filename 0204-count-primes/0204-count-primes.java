class Solution {
    public int countPrimes(int n) {
        boolean[] s = new boolean[n+2];
        Arrays.fill(s,true);
        s[0]=false;
        s[1]=false;
        for(int i=2;i*i<n;i++){
            if(s[i]){
                for(int j=i*i;j<n;j+=i){
                    s[j]=false;
                }
            }
        }
        int c = 0;
        for(int i=2;i<n;i++){
            System.out.println(s[i]);
            if(s[i])c++;
        }
        return c;
    }
}