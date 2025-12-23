class Solution {
    public String arrangeWords(String text) {
        TreeMap<Integer,ArrayList<String>> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        String[] s = text.trim().split("\\s+");
        for(String str : s){
            int n = str.length();
            if(!map.containsKey(n)){
                map.put(n,new ArrayList<>());
                map.get(n).add(str);
            }
            else{
                map.get(n).add(str);
            }
        }
        boolean flag = true;
        for(List<String> a : map.values()){
            for(int i=0;i<a.size();i++){
                if(flag){
                    sb.append(Character.toUpperCase(a.get(i).charAt(0)));
                    sb.append(a.get(i).substring(1).toLowerCase());
                    sb.append(" ");
                    flag = false;
                }
                else{
                    sb.append(a.get(i).toLowerCase());
                    sb.append(" ");
                }
            }
        }
    return sb.toString().trim();
    }
}