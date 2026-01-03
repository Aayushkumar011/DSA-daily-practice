class Solution {
    public static void dfs(int[][] image, int i, int j, int color,int cur_color, int n, int m, boolean[][] v, int[][]dir){
        if(i<0 || j<0 || i>=n || j>=m || v[i][j] || image[i][j]!=cur_color)return;
        v[i][j]=true;
        image[i][j]=color;
        for(int k=0;k<4;k++){
            dfs(image,i+dir[k][0],j+dir[k][1],color,cur_color,n,m,v,dir);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int cur_color = image[sr][sc];
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] visited = new boolean[n][m];
        dfs(image,sr,sc,color,cur_color,n,m,visited,direction);
    return image;
    }
}