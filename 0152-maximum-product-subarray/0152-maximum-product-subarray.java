class Solution {
    public int maxProduct(int[] nums) 
    { 
        int max=Integer.MIN_VALUE;
        int prd=1;
        for(int i=0;i<nums.length;i++)
        {
           prd*=nums[i];
           if(prd>max)
           max=prd;
           if(prd==0)
           prd=1;
        }
        prd=1;
         for(int i=nums.length-1;i>=0;i--)
        {
           prd*=nums[i];
           if(prd>max)
           max=prd;
           if(prd==0)
           prd=1;
        }

        return max;
    }
}