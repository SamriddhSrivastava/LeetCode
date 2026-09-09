class Solution {
    public long countCommas(long n) 
    {
        long ans=0;
        long s=1000;
        long com=1;
        while(s<=n) 
        {
            long end=Math.min(n,s*1000-1);
            ans+=(end-s+1)*com;
            s*=1000;
            com++;
        }
        return ans;
    }
}