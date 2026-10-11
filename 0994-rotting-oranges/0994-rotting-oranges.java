class Pair{
    int row;
    int col;
    int tm;
    Pair(int r,int c,int t)
    {
     this.row=r;
     this.col=c;
     this.tm=t;
    }
    }
    class Solution {
    public int orangesRotting(int[][] grid)
    {
         int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        int cntf=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                  q.add(new Pair(i,j,0));
                  vis[i][j]=2;
                }
                else if(grid[i][j]==1)
                cntf++;
            }
        }
        int tm=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(t,tm);
            q.remove();
            for(int i=0;i<4;i++)
            {
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1)
                {
                    q.add(new Pair(nr,nc,t+1));
                    vis[nr][nc]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntf)
        return -1;
        return tm;
    }
}
