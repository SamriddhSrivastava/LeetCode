class Pair
{
     int row;
     int col;
     Pair(int r,int c)
     {
      this.row=r;
      this.col=c;
     }
}
class Solution 
{
    public int numEnclaves(int[][] grid) 
    {
     int n=grid.length;
     int m=grid[0].length;
     Queue<Pair> q=new LinkedList<>();
     HashSet<String> set=new HashSet<>();
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1)
            set.add(i+","+j);
            if((i==0 || i==n-1 || j==0 || j==m-1)  && grid[i][j]==1)
            q.add(new Pair(i,j));
        }
     }   
     int drow[]={-1,0,1,0};
     int dcol[]={0,1,0,-1};
     while(!q.isEmpty())
     {
        int r=q.peek().row;
        int c=q.peek().col;
        if(set.contains(r+","+c))
        set.remove(r+","+c);
        q.remove();
        for(int i=0;i<4;i++)
        {
            int nr=r+drow[i];
            int nc=c+dcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1)
            {
                q.add(new Pair(nr,nc));
                grid[nr][nc]=0;
            }
        }
     }
     return set.size();
    }
}