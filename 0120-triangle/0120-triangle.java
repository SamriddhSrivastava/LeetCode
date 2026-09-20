class Solution {
    public int minimumTotal(List<List<Integer>> triangle) 
    {
      int r=triangle.size();
      int c=triangle.get(r-1).size();
      int dp[]=new int[c+1];
      Arrays.fill(dp,0);
      for(int i=r-1;i>=0;i--)
      {
        int temp[]=new int[c];
        for(int j=0;j<c;j++)
        {
          temp[j]=triangle.get(i).get(j)+Math.min(dp[j],dp[j+1]);
        }
        dp=temp;
        c--;
      }   return dp[0];
    }
}