class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
      List<Integer> list=new ArrayList<>();
      Arrays.sort(nums);
      int i=0;
      int k=nums[0];
      while(i<nums.length)
      {
        if(k==nums[i])
            i++;
        else
        list.add(k);
        k++;
      }
      return list;
    }
}