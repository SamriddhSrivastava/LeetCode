class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
     int vis[]=new int[numCourses];
     int[] pathVis=new int[numCourses];
     ArrayList<ArrayList<Integer>> list=new ArrayList<>();
     for(int i=0;i<numCourses;i++)
     {
        ArrayList<Integer> l=new ArrayList<>();
        list.add(l);
     }
     for(int i=0;i<prerequisites.length;i++)
     {
        int n1=prerequisites[i][0];
        int n2=prerequisites[i][1];
        list.get(n1).add(n2);
     }
     for(int i=0;i<numCourses;i++)
     {
      if(vis[i]==0)
      {
        if(dfs(i,vis,pathVis,list))
            return false;
      }
     }
    return true;
    }
    public boolean dfs(int node,int []vis,int []pathVis,ArrayList<ArrayList<Integer>> list)
    {
      vis[node]=1;
      pathVis[node]=1;
      ArrayList<Integer> l=list.get(node);
      for(int i=0;i<l.size();i++)
      {
        int n=l.get(i);
        if(vis[n]==0)
        {
            if(dfs(n,vis,pathVis,list)==true)
            return true;
        }
        else if(pathVis[n]==1)
        {
          return true;
        }
      }
      pathVis[node]=0;
      return false;
    }
}