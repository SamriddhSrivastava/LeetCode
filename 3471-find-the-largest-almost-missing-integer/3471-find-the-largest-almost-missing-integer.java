class Solution {
    public int largestInteger(int[] nums, int k) 
    {
      int arr[]=new int[51];
      int max=nums[0];
      for(int i=0;i<nums.length;i++)
      {
        max=Math.max(max,nums[i]);
        arr[nums[i]]++;
      }

      if(k==nums.length)
      return max;
      
      else if(k==1)
      {
        for(int i=50;i>=0;i--)
        {  
             if(arr[i]==1)
             return i;
        }
      }

      else
      {
        if(nums[0]>nums[nums.length-1] && arr[nums[0]]==1)
        return nums[0];
        else if(nums[0]>nums[nums.length-1] && arr[nums[nums.length-1]]==1)
        return nums[nums.length-1];
        else if(nums[0]<nums[nums.length-1] && arr[nums[nums.length-1]]==1)
        return nums[nums.length-1];
        else if(nums[0]<nums[nums.length-1] && arr[nums[0]]==1)
        return nums[0];
        else
        return -1;
      }
      return -1;
    }
}