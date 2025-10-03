class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] l = new List[n+1];
        for(char c : map.keySet()){
            int index = map.get(c);
            if(l[index]==null)l[index]=new ArrayList<>();
            l[index].add(c);
        }
        StringBuilder str = new StringBuilder();
        for(int i=n;i>0;i--){
            if(l[i]!=null){
                for(char ch : l[i]){
                    for(int j=0;j<i;j++){
                        str.append(ch);
                    }
                }
            }
        }
        return str.toString();
    }
}