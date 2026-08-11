class Solution {
    public int missingInteger(int[] nums) 
    {
      if(nums.length==1)
      return nums[0]+1;
      HashSet<Integer> set=new HashSet<>();
      int maxlen=0;
      int msum=0,sum=nums[0];
      int s=0;
      set.add(nums[0]);
      int flag=0;
      for(int i=1;i<nums.length;i++)
      {
        set.add(nums[i]);
        if(nums[i]==nums[i-1]+1)
           sum+=nums[i];
        else
        {
           if(flag==0)
           {
           flag=1;
           maxlen=i-s;
           msum=sum;
           }
        }
      } 
      if(flag==0)
      return sum;
      while(set.contains(msum))
      {
        msum++;
      }
      return msum;
    }
}