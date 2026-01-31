class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target>=letters[n-1])return letters[0];
        char ch = 'a';
        for(int i=0;i<n;i++){
            if(letters[i]>target){
                ch=letters[i];
                break;
            }
        }
    return ch; 
    }
}