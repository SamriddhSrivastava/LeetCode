class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) 
    {
     int n=arr.length;
     int dp[]=new int[n+1];
     dp[n]=0;
     for(int i=n-1;i>=0;i--)
     {
        int l=0;
        int max=Integer.MIN_VALUE;
        int e=Integer.MIN_VALUE;
        for(int j=i;j<Math.min(n,i+k);j++)
        {
          l++;
          e=Math.max(e,arr[j]);
          int c=l*e+dp[j+1];
          max=Math.max(max,c);
        }
        dp[i]=max;
     }   
     return dp[0];
    }
}