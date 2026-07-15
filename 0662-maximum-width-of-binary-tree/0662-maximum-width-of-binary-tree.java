/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) 
    {
       return width(root);
    }
    public int width(TreeNode root)
    {
        int res=0;
      if(root==null)
      return res;
      Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
      q.add(new Pair<>(root,0));
      while(!q.isEmpty())
      { 
        int n=q.size();
        int lm=0,rm=0;
        for(int i=0;i<n;i++)
        {
          Pair<TreeNode,Integer> p=q.poll();
          TreeNode temp=p.getKey();
          int index=p.getValue();

          if(i==0)
          lm=index;
          if(i==n-1)
          rm=index;
          
          if(temp.left!=null)
          q.offer(new Pair<>(temp.left,2*index+1));
          if(temp.right!=null)
          q.offer(new Pair<>(temp.right,2*index+2));
        }
        res=Math.max(res,rm-lm+1);
      }
      return res;
    }
}