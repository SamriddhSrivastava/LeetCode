class Solution {
    public boolean isMatch(String s, String p) 
    {
        int n=s.length();
        int m=p.length();
      boolean prev[]=new boolean[n+1];
      prev[0]=true;
      
      for(int i=1;i<=m;i++)
      {
        boolean cur[]=new boolean[n+1];
        boolean flag=true;
         for(int ii=1;ii<=i;ii++)
         {
            if(p.charAt(ii-1)!='*')
             {
                flag=false;
                break;
             }
         }
         cur[0]=flag;
         for(int j=1;j<=n;j++)
         {
            if(s.charAt(j-1)==p.charAt(i-1) || p.charAt(i-1)=='?')
             cur[j]=prev[j-1];
            if(p.charAt(i-1)=='*')
             cur[j]=prev[j] || cur[j-1];
           
         }
         prev=cur;
      }
      return prev[n];
    }
}