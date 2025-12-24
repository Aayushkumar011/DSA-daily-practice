class Solution {
    public int countCollisions(String directions){
        char[] arr = directions.toCharArray();
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]=='L' && arr[i-1]!='L'){
                c++;
                arr[i]='S';
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i!=n-1 && arr[i]=='R' && arr[i+1]!='R'){
                c++;
                arr[i]='S';
            }
        }
    return c;
    }
}