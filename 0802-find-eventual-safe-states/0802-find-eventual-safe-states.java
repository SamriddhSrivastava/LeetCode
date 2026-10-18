class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) 
    {
      ArrayList<Integer> ans=new ArrayList<>();
      int n=graph.length;
      int w[]=new int[n];
      ArrayList<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        ArrayList<Integer> l=new ArrayList<>();
        list.add(l);
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<graph[i].length;j++)
        {
          list.get(graph[i][j]).add(i);  
          w[i]+=1;
        }
      }
      
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<n;i++)
      {
        if(w[i]==0)
        q.add(i);
      }

      while(!q.isEmpty())
      {
        int node=q.poll();
        ans.add(node);
        List<Integer> l1=list.get(node);
        for(int i=0;i<l1.size();i++)
        {
            w[l1.get(i)]-=1;
            if(w[l1.get(i)]==0)
            q.add(l1.get(i));
        }
      }

      Collections.sort(ans);
      return ans;
    }
}