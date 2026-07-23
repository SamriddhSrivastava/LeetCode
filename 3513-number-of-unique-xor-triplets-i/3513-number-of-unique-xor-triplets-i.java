/*class Solution {
    public int uniqueXorTriplets(int[] nums) 
    {
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<nums.length;i++) 
     {
        for(int j=0;j<nums.length;j++) 
        {
            for(int k=0;k<nums.length;k++) 
            {
                int a=nums[i]^nums[j]^nums[k];
                set.add(a);
            }
        }
     }  return set.size();
    }
}
*/

class Solution 
{
    public int uniqueXorTriplets(int[] nums) 
    {
        int n=nums.length;
        if(n==1)return 1;
        if(n==2)return 2;

        int bits=32-Integer.numberOfLeadingZeros(n);
        return 1 << bits;
    }
}