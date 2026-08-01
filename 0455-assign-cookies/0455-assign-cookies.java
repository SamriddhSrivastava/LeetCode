class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        int c=0;
     Arrays.sort(g);
     Arrays.sort(s);
     int i=0,j=0;
     while(j<s.length && i<g.length)
     {
        if(g[i]<=s[j])
        {
            c++;
            i++;
            j++;
        }
        else
        {
            j++;
        }
     } 
     return c;  
    }
}