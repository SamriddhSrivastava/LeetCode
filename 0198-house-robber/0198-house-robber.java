class Solution {
    public int rob(int[] nums) 
    {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return func(nums.length-1,nums,dp);
    }
    int func(int ind,int arr[],int dp[])
    {
        if(ind<0)
        return 0;
        if(ind==0)
        return arr[0];

        if(dp[ind]!=-1)
        return dp[ind];

        int pick=0,npick=0;
        pick=arr[ind]+func(ind-2,arr,dp);
        npick=0+func(ind-1,arr,dp);

        dp[ind]=Math.max(pick,npick);
        return dp[ind];
    }
}