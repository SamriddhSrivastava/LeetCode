class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
         int r=image.length;
        int c=image[0].length;
        int visited[][]=new int[r][c];
        int p=image[sr][sc];
        if(p==color)
           return image;
        dfs(sr,sc,image,color,p);
        return image;
    }
    private void dfs(int i,int j,int[][] image,int color,int p) 
    {
       if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=p)
        return;

        image[i][j]=color;
        dfs(i+1,j,image,color,p);
        dfs(i-1,j,image,color,p);
        dfs(i,j+1,image,color,p);
        dfs(i,j-1,image,color,p);
    }
}