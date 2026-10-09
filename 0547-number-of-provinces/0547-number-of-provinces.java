class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int n=isConnected.length;
        int visited[]=new int[n];
        int p=0;
        for(int city=0;city<n;city++) 
        {
            if(visited[city]==0) 
            {
                p++;
                dfs(city,isConnected,visited);
            }
        }
        return p;
    }  
    private void dfs(int city,int[][] isConnected,int[] visited) 
    {
        visited[city]=1;
        int n=isConnected.length;
        for(int nextCity=0;nextCity<n;nextCity++) 
        {
            if(isConnected[city][nextCity]==1 && visited[nextCity]==0) 
                dfs(nextCity,isConnected,visited);
        }
    }
}