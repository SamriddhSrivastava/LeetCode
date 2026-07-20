class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
      int r=grid.length;
      int c=grid[0].length;
      k%=(c*r);
      while(k-->0)
      grid=func(grid);
      List<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<r;i++)
      {
        List<Integer> l=new ArrayList<>();
        for(int j=0;j<c;j++)
        {
            l.add(grid[i][j]);
        }
        list.add(l);
      }
      return list;
    }
    int[][] func(int[][] grid)
    {
      int r=grid.length;
      int c=grid[0].length;
      
      int arr[]=new int[r];
      for(int i=0;i<r;i++)
      arr[i]=grid[(i-1+r)%r][c-1];

      for(int i=r-1;i>=0;i--)
      {
        for(int j=c-1;j>=0;j--)
        {
           if(j==0)
           grid[i][j]=arr[i];
           else
             grid[i][j]=grid[i][j-1];
        }
      } 
      return grid;
    }
}