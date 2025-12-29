class Solution {
    public static void dfs(int[][] image, int i, int j, int color,int n,int m,boolean[][] visited,int c){
         if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || image[i][j]!=c)return;
        visited[i][j]=true;
        image[i][j]=color;
        int dir[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        for(int k=0;k<4;k++){
            dfs(image,i+dir[k][0],j+dir[k][1],color,n,m,visited,c);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int c = image[sr][sc];
        boolean[][] visited = new boolean[n][m];
        dfs(image,sr,sc,color,n,m,visited,c);
    return image;
    }
}