class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
       int maxlen=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       int i=0,j=0;
       while(j<nums.length)
       {
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        if(map.get(nums[j])>k)
        {
            while(map.get(nums[j])>k)
            {
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
        }
        j++;
        maxlen=Math.max(maxlen,j-i);
       }
       return maxlen;
    }
}