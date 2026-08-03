class Solution {
    public String longestPalindrome(String s) 
    {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int len1 = expand(s, i, i);     // odd length
            int len2 = expand(s, i, i + 1); // even length
            int len = Math.max(len1, len2);

            if (len > end - start)
            {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right)
    {
        while (left >= 0 && right < s.length()
               && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left - 1;
    }
}















/*class Solution {
    public String longestPalindrome(String s) 
    {
       String sm=""; 
       int max=0;
       for(int i=0;i<s.length();i++)
       {
        for(int r=i+1;r<s.length()+1;r++)
        {
           boolean c=check(s.substring(i,r));
           if(c && sm.length()<s.substring(i,r).length())
           {
            sm=s.substring(i,r);
           }
        }  
       } return sm;
    }
    boolean check(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
             return false;
        }
        return true;
    }
}*/