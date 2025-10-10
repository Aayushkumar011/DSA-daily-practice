class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            String temp = arr[i];
            arr[i] = arr[n-(i+1)];
            arr[n-(i+1)] = temp;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n-1;i++){
            str.append(arr[i]+" ");
        }
        str.append(arr[n-1]);
        return str.toString().trim();
    }
}