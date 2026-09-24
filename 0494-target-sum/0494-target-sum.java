class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {
        int tsum=0;
        for(int i=0;i<nums.length;i++)
          tsum+=nums[i];
        int rem=tsum-target;
        if(rem<0 || rem%2!=0)
        return 0;
        target=rem/2;
        int[] dp=new int[target+1];
        
        dp[0]=1;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            for(int j=target;j>=n;j--)
             dp[j]=dp[j]+dp[j-n];
        }
        return dp[target];

    }
}