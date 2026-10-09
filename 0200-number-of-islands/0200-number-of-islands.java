class Solution {
    public int numIslands(char[][] grid) 
    {    
        int r=grid.length;
        int c=grid[0].length;
        int visited[][]=new int[r][c];
        int p=0;
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++)
            {
            if(visited[i][j]==0 && grid[i][j]=='1') 
            {
                p++;
                dfs(i,j,grid,visited);
            }
            }
        }
        return p;
    }  
    private void dfs(int r,int c,char[][] grid,int[][] visited) 
    {
        visited[r][c]=1;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=-1;i<=1;i++) 
        {
            for(int j=-1;j<=1;j++)
            {
                int cr=r+i,cc=c+j;
            if((i==0 || j==0) && (i!=0 || j!=0) && cr>=0 && cr<m && cc>=0 && cc<n && visited[cr][cc]==0 && grid[cr][cc]=='1') 
            {
                dfs(cr,cc,grid,visited);
            }
            }
        }

    }
}