class Solution {
    public int smallestNumber(int n, int t) 
    {
       int i=n;
       while(true)
       {
         int num=i,p=1;
         while(num>0)
         {
            p*=num%10;
            num/=10;
         }
         if(p%t==0)
         return i;
         i++;
       }
    }
}