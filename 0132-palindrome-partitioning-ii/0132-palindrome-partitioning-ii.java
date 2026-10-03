class Solution {
    public int minCut(String s) 
    {
     int n=s.length();
     int dp[]=new int[n+1];
     dp[n]=0;
     for(int i=n-1;i>=0;i--)
     {
        int mincost=Integer.MAX_VALUE;
        for(int j=i;j<n;j++)
        {
            int cost=Integer.MAX_VALUE;
            if(isPalindrome(i,j,s))
              cost=1+dp[j+1];
            mincost=Math.min(cost,mincost);
        }
       dp[i]=mincost;
     }   
     return dp[0]-1;
    }
    static boolean isPalindrome(int i,int j,String s)
    {
      while(i<j)
      {
        if(s.charAt(i)!=s.charAt(j))
            return false;
        i++;
        j--;
      }
      return true;
    }
}