class Solution {
    public boolean checkDivisibility(int n) 
    {
     int sum=0;
     int prd=1;
     int n1=n;
     while(n1!=0)
     {
       int l=n1%10;
       n1/=10;
       sum+=l;
       prd*=l;
     }   
     if(n%(sum+prd)==0)
     return true;
     return false;
    }
}