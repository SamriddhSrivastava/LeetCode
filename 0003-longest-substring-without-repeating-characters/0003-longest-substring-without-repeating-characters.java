class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int freq[]=new int[256];
        int l=0;         int t=0;
        for(int r=0;r<s.length();r++)
        {
            freq[s.charAt(r)]++;
            while(freq[s.charAt(r)]>1)
            {
                freq[s.charAt(l)]--;
                l++;
            }
            t=Math.max(t,r-l+1);
        }
        return t;
    }
}













/*class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int t=0;
    if (s.length() == 0) 
    return 0;
    
    for(int j=0;j<s.length()+1;j++)
    {
        int i=0;
        while(i<j)
        {
        String s1=s.substring(i,j);
        if(check(s1))
          {  t=Math.max(t,j-i);
          break;
          }
        else
          i++;
        }
    }
     return t;
    }
    public boolean check(String s)
    {
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            arr[c]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>1)
            return false;
        }
        return true;
    }
}*/