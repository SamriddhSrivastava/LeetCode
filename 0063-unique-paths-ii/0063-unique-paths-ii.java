class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

       int prev[]=new int[n];
      Arrays.fill(prev,0);
      for(int i=0;i<m;i++)
      {
        int temp[]=new int[n];
        for(int j=0;j<n;j++)
        {
            if(obstacleGrid[i][j]==1)
            {
              temp[j]=0;
              continue;
            }

            if(i==0 && j==0) temp[j]=1;
            else
            {
              if(j-1>=0)
              temp[j]=prev[j]+temp[j-1];
              else
              temp[j]=prev[j];
            }
        }prev=temp;
      }return prev[n-1] ;  
    }
}