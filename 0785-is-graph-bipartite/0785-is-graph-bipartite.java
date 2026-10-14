class Solution {
    public boolean isBipartite(int[][] graph) 
    {
      int n=graph.length;
    
      int vis[]=new int[n];
      Arrays.fill(vis,-1);
      for(int i=0;i<n;i++)
      {
        if(vis[i]==-1)
        {
            if(bfs(i,vis,graph)==false)
            return false;
        }
      }
      return true;
    }
    public boolean bfs(int node,int vis[],int graph[][])
    {
        vis[node]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
         int n=q.poll();
         for(int i=0;i<graph[n].length;i++)
         {
           if(vis[graph[n][i]]==-1)
           {
             q.add(graph[n][i]);
             vis[graph[n][i]]=1-vis[n]; 
           }
           else if(vis[n]==vis[graph[n][i]])
           return false;
         }
        }
        return true;
    }
}
