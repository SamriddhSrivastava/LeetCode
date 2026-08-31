class Solution {
    public String shortestBeautifulSubstring(String s, int k) 
    {
        int n=s.length();
        int[] pos=new int[n];
        int count=0;
        for(int i=0;i<n;i++) 
        {
            if(s.charAt(i)=='1')
                pos[count++]=i;
        }
        if(count<k)
            return "";
        String ans="";
        for(int i=0;i+k-1<count;i++)
        {
            int start=pos[i];
            int end=pos[i+k-1];
            String curr=s.substring(start,end+1);
            if(ans.equals("") || curr.length()<ans.length())
                ans=curr;
            else if(curr.length()==ans.length() && curr.compareTo(ans)<0) 
                ans=curr;
        }
        return ans;
    }
}