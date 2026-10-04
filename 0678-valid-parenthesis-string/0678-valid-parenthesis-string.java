class Solution {
    public boolean checkValidString(String s) 
    {
      int minop=0,maxop=0;
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c=='(')
        {
            minop++;
            maxop++;
        }
        else if(c==')')
        {
            minop--;
            maxop--;
        }
        else //(c=='*')
        {  
          maxop++;
          minop--;
        }
      if(maxop<0)
      return false;
      if(minop<0)
      minop=0;
      }
      return minop==0;
    }
}