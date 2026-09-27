class Solution {
    
    boolean check(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2+1)  
        return false;
        int i=0,j=0;
        while(i<l1 && j<l2)
        {  

            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            i++;
        }
        if(j==l2)
        return true;
        return false;
    }
    public int longestStrChain(String[] words) 
    {
        int n=words.length;
        Arrays.sort(words,(a,b)->a.length() - b.length());

        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxi=0;

       for(int i=0;i<n;i++)
       {
         for(int j=0;j<i;j++)
         {
            if(check(words[i],words[j]) && dp[i]<dp[j]+1)
                dp[i]=dp[j]+1;
         }
            maxi=Math.max(maxi,dp[i]);
       }
       return maxi;   
    }
}