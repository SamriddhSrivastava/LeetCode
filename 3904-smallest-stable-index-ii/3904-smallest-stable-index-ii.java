class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        int maxr[]=new int[nums.length];
        int minr[]=new int[nums.length];
        maxr[0]=nums[0];
        minr[nums.length-1]=nums[nums.length-1];
     for(int i=1;i<nums.length;i++)
        maxr[i]=Math.max(maxr[i-1],nums[i]);
     for(int i=nums.length-2;i>=0;i--)
        minr[i]=Math.min(minr[i+1],nums[i]);
     for(int i=0;i<nums.length;i++)
     {
       if(maxr[i]-minr[i]<=k)
        return i; 
     }
     return -1;
    }
}