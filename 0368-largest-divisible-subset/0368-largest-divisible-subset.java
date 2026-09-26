class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxi=1;
        int hash[]=new int[n];
        hash[0]=0;
        int lastind=0;
        List<Integer> list=new ArrayList<>();
       for(int i=1;i<n;i++)
       {
        hash[i]=i;
         for(int j=0;j<i;j++)
         {
            if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1)
            {
                dp[i]=dp[j]+1;
                hash[i]=j;
            }
         }
         if(dp[i]>maxi)
         {
            maxi=dp[i];
            lastind=i;
         }
       }
       list.add(nums[lastind]);
       while(hash[lastind]!=lastind)
       {
        lastind=hash[lastind];
        list.add(nums[lastind]);
       }
       return list;
    }
}