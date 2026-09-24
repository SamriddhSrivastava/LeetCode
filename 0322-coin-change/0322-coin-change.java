class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int prev[]=new int[amount+1];
        Arrays.fill(prev,Integer.MAX_VALUE);
        prev[0]=0;
        for(int ind=0;ind<coins.length;ind++)
        {
            int cur[]=new int[amount+1];
            Arrays.fill(cur, Integer.MAX_VALUE);
            cur[0] = 0;
            for(int j=0;j<=amount;j++)
            {
               int npick=prev[j];
               int pick=Integer.MAX_VALUE;
               if(coins[ind]<=j && cur[j-coins[ind]] != Integer.MAX_VALUE) 
                  pick=1+cur[j-coins[ind]];
               cur[j]=Math.min(pick,npick); 
            }
            prev=cur;
        }
        return prev[amount]==Integer.MAX_VALUE ? -1:prev[amount];
    }
}

/*
int npick=0+func(ind-1,amount);
int pick=Integer.MAX_VALUE;
if(coins[ind]<=amount) pick=1+func(ind,amount-coins[ind]);
return Math.min(pick,npick);
*/