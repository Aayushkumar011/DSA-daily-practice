class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    c++;
                }
                if(c>=n)return true;
            }
        }
    return c>=n;
    }
}