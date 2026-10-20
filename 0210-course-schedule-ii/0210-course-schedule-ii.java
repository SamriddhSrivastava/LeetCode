class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) 
    {
        int ans[]=new int[numCourses];
        Stack<Integer> st=new Stack<>();
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
        list.get(n2).add(n1);
     }
     for(int i=0;i<numCourses;i++)
     {
      if(vis[i]==0)
      {
        if(dfs(i,vis,pathVis,list,st))
            return new int[0];
      }
     }
     for(int i=0;i<numCourses;i++)
     ans[i]=st.pop();
    return ans;
    }
    public boolean dfs(int node,int []vis,int []pathVis,ArrayList<ArrayList<Integer>> list,Stack<Integer> st)
    {
      vis[node]=1;
      pathVis[node]=1;
      ArrayList<Integer> l=list.get(node);
      for(int i=0;i<l.size();i++)
      {
        int n=l.get(i);
        if(vis[n]==0)
        {
            if(dfs(n,vis,pathVis,list,st)==true)
            return true;
        }
        else if(pathVis[n]==1)
        {
          return true;
        }
      }
      st.push(node);
      pathVis[node]=0;
      return false;   
    }
}