class Solution {
    public boolean canPartition(int[] nums) 
    {
        int tsum=0;
        for(int i=0;i<nums.length;i++)
         tsum+=nums[i];
        if(tsum%2==1)
        return false;
        int s=tsum/2;
        int dp[][]=new int[nums.length][s+1];
        for(int i=0;i<nums.length;i++)
          Arrays.fill(dp[i],-1);
        return func(0,nums,s,dp)==1;
    }
    static int func(int ind,int nums[],int s,int dp[][])
    {
        if(ind==nums.length-1)
        return s==nums[ind] ? 1:0;
        if(s==0)
        return 1;
        if(dp[ind][s]!=-1)
        return dp[ind][s];
        boolean b1=false;
        if(nums[ind]<=s)
         b1=func(ind+1,nums,s-nums[ind],dp)==1;
        boolean b2=func(ind+1,nums,s,dp)==1;
        return dp[ind][s]=b1||b2 ? 1 : 0;
    }
}


//method 2 more precise
/*class Solution {
    public boolean canPartition(int[] nums) 
    {
        int total=0;
        for(int n : nums) 
            total+=n;

        if(total%2!=0)
            return false;

        int target=total/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;

        for(int num : nums) 
        {
            for(int j=target;j>=num;j--)
                dp[j]=dp[j] || dp[j-num];
        }
        return dp[target];
    }
}*/