class Solution {
    public int reverseDegree(String s) 
    {
      int sum=0;
      for(int i=0;i<s.length();i++)
      {
        sum+=(int)(-1*(s.charAt(i)-'a')+26)*(i+1);
      }   
      return sum;
    }
}