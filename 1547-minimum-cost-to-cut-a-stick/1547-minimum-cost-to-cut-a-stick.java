class Solution {
    public int minCost(int n, int[] cuts) 
    {
      int arr[]=new int[cuts.length+2];
      arr[0]=0;
      for(int i=0;i<cuts.length;i++)
       arr[i+1]=cuts[i];
      arr[cuts.length+1]=n;
      Arrays.sort(arr);

      int l=arr.length;
      int dp[][]=new int[l+1][l+1];
      for(int i=l-2;i>=1;i--)
      {
        for(int j=1;j<=l-2;j++)
        {
            if(i>j)
            continue;
            int min=Integer.MAX_VALUE;
            int cost=0;
            for(int ind=i;ind<=j;ind++)
            {
             cost=arr[j+1]-arr[i-1]+dp[i][ind-1]+dp[ind+1][j];
             min=Math.min(cost,min);
            }
            dp[i][j]=min;
        }
      }  
      return dp[1][l-2];
    }
}