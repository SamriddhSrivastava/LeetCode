/*class Solution {
    public int uniquePaths(int m, int n)                        //8 2d 6r
    { 
      int N=m+n-2;
      int R=Math.min(m-1,n-1);
      long f=1;
      for(int i=1;i<=R;i++)
       f=f*(N-R+i)/i;
      return (int) f;
        
    }
}
*/
class Solution {
    public int uniquePaths(int m, int n)                        //8 2d 6r
    { 
      int prev[]=new int[n];
      Arrays.fill(prev,0);
      for(int i=0;i<m;i++)
      {
        int temp[]=new int[n];
        for(int j=0;j<n;j++)
        {
            if(i==0 && j==0) temp[j]=1;
            else
            {
              if(j-1>=0)
              temp[j]=prev[j]+temp[j-1];
              else
              temp[j]=prev[j];
            }
        }prev=temp;
      }return prev[n-1];
    }
}



