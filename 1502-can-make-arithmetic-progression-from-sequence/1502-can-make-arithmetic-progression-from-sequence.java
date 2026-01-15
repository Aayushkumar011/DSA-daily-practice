class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        boolean flag = true;
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=d){
                flag=false;
                break;
            }
        }
    return flag;
    }
}