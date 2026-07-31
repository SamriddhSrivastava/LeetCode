class Solution {
    public int minimumPushes(String word) 
    {
      int l=word.length();
      int i=1;
      int sum=0;
      while(l>=0)
      {
        sum=sum+l;
        l=l-8;
      }
      return sum;
    }
}