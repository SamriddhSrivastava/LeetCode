class Solution {
    public int maxProfit(int[] prices)
    {
        int prev[]=new int[2];
        Arrays.fill(prev,0);
        int n=prices.length;
        for(int i=n-1;i>=0;i--)
        {
             int temp[]=new int[2];
            for(int buy=0;buy<=1;buy++)
            {
                int profit=0;
                if(buy==1)
                profit=Math.max(-prices[i]+prev[0],0+prev[1]);
                else
                profit=Math.max(prices[i]+prev[1],0+prev[0]);
                temp[buy]=profit;
            }
            prev=temp;
        }
        return prev[1];
    }
}