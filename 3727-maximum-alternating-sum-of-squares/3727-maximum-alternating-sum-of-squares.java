class Solution {
    public long maxAlternatingSum(int[] nums) 
    {
     for(int i=0;i<nums.length;i++)
     nums[i]*=nums[i];
     Arrays.sort(nums);
     long score=0;
     for(int i=nums.length-1;i>=0;i--)
     {
        if(i<nums.length/2)
        score-=nums[i];
        else
        score+=nums[i];
     } 
     return score;  
    }
}