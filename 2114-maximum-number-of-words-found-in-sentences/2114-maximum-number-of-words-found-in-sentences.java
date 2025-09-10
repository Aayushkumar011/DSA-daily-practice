class Solution {
    public int mostWordsFound(String[] sentences) {
        int c = 0;
        for(String s : sentences){
            String[] a = s.split(" ");  
            int l = a.length;
            if(l>c)c=l;
        }
        return c;
    }
}