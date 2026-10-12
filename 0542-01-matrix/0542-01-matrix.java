class Pair
{
    int row;
    int col;
    int steps;
    Pair(int r,int c,int s)
    {
        row=r;
        col=c;
        steps=s;
    }
}

class Solution
{
    public int[][] updateMatrix(int[][] mat)
    {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int steps=p.steps;
            dist[r][c]=steps;
            for(int i=0;i<4;i++)
            {
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if(nr>=0 && nr<n&& nc>=0 && nc<m && vis[nr][nc]==0)
                {
                    vis[nr][nc]=1;
                    q.add(new Pair(nr,nc,steps+1));
                }
            }
        }
        return dist;
    }
}