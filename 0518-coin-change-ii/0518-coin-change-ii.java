class Solution {
    public int change(int amount, int[] coins) 
    {
      int prev[]=new int[amount+1];
      for(int i=0;i<=amount;i++)
      {
        prev[i]=(i%coins[0]==0) ? 1 : 0;
      }
      for(int i=1;i<coins.length;i++)
      {
        int curr[]=new int[amount+1];
        for(int j=0;j<=amount;j++)
        {
            int ntake=prev[j];
            int take=0;
            if(coins[i]<=j)
             take=curr[j-coins[i]];
            curr[j]=ntake+take;
        }prev=curr;
      }  return prev[amount];
    }
}