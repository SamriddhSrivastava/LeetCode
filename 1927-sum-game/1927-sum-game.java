class Solution {
    public boolean sumGame(String num) 
    {
      int sl=0,sr=0,l=0,r=0;
      for(int i=0;i<num.length();i++)
      {
        char c=num.charAt(i);
        if(i<num.length()/2)
        {
            if(c=='?')
            l++;
            else
            sl+=(int)(c-48);
        }
        else
        {
            if(c=='?')
            r++;
            else
            sr+=(int)(c-48);
        }
      }
      if(2*(sl-sr)==9*(r-l))
      return false;
      return true;
    }
}