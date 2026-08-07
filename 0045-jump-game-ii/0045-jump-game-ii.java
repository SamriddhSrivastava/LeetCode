class Solution {
    public int jump(int[] nums) 
    {
      int maxindex=0;
      int c=0,currend=0;
      for(int i=0;i<nums.length-1;i++)
      {
        maxindex=Math.max(maxindex,i+nums[i]);
        if(i==currend)
        {
          c++;
          currend=maxindex;
        }
      }
      return c;
    }
}