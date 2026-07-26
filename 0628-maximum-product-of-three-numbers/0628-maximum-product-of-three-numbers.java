class Solution {
    public int maximumProduct(int[] nums) 
    {
      Arrays.sort(nums);
      int l=nums.length;
      int t2=nums[l-1]*nums[l-2]*nums[l-3];
      int t1=nums[0]*nums[1]*nums[l-1];
      int ans=Math.max(t1,t2);
     return ans;
    }
}