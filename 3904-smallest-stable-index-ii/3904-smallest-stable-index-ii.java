class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        int minr[]=new int[nums.length];
        int maxr=nums[0];
        minr[nums.length-1]=nums[nums.length-1];
     for(int i=nums.length-2;i>=0;i--)
        minr[i]=Math.min(minr[i+1],nums[i]);
     if(maxr-minr[0]<=k)
        return 0;
     for(int i=1;i<nums.length;i++)
     {
        maxr=Math.max(maxr,nums[i]);
        if(maxr-minr[i]<=k)
        return i;
     }
     return -1;
    }
}