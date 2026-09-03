class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        int min=nums1[0];
        int odd=0;
         for(int i=0;i<nums1.length;i++)
         {
            if(nums1[i]%2!=0)
            odd++;
           min=Math.min(min,nums1[i]);
         }
        if(odd==0 || odd==nums1.length)
        return true;
        else if(min%2!=0)
        return true;
        else return false;
    }
}