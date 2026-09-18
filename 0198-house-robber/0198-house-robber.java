/*class Solution {
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
}*/

class Solution {
    public int rob(int[] nums) 
    {
       int prev1=nums[0],prev2=0,curr=prev1;
       for(int i=1;i<nums.length;i++)
       {
         int pick=0,npick=0;
         pick=nums[i]+prev2;
         npick=0+prev1;
         curr=Math.max(pick,npick);
         prev2=prev1;
         prev1=curr;
       }
       return curr;
    }
}