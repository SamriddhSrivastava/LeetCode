class Solution {
    public int maximumLengthSubstring(String s) 
    {
      int arr[]=new int[123];
      int i=0,j=0,max=0;
      while(j<s.length())
      {
        char c=s.charAt(j);
        arr[c]++;
        if(arr[c]>2)
        {
            while(arr[c]>2)
            {
                arr[s.charAt(i)]--;
                i++;
            }
        }max=Math.max(max,j-i+1);
        j++;
      }   
      return max;
    }
}