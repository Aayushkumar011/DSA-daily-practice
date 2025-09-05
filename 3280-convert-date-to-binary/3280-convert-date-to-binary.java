class Solution {
    public static StringBuilder helper(int val){
        StringBuilder str = new StringBuilder();
        while(val>0){
            int rem = val%2;
            str.append(rem);
            val=val/2;
        }
        return str.reverse();
    }
    public String convertDateToBinary(String date) {
        String s = "";
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        s += helper(year) + "-" + helper(month) + "-" + helper(day);

    return s;
    }
}