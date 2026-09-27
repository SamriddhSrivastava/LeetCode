class Solution {
    public int lengthOfLIS(int[] nums) 
    {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int maxi=0;
      for(int i=0;i<nums.length;i++)
      {
        for(int j=0;j<i;j++)
        {
            if(nums[i]>nums[j] && dp[j]+1>dp[i])
            dp[i]=dp[j]+1;
        }
        maxi=Math.max(maxi,dp[i]);
      }   
      return maxi;
    }
}