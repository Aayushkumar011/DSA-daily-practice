class Solution {
    public int findClosest(int x, int y, int z) {
        if(x==z && y==z)return 0;
        if(x==z)return 1;
        if(y==z)return 2;
        if(x<z && y<z){
            if(x<y)return 2;
            else return 1;
        }
        if(x>z && y>z){
            if(x>y)return 2;
            else return 1;
        }
        if(x<z && y>z){
            while(x!=z && y!=z){
                x++;
                y--;
            }
        }
        else{
            while(x!=z && y!=z){
                x--;
                y++;
            }
        }
    if(x==z && y==z)return 0;
    else if(x==z)return 1;
    else return 2;
    }
}