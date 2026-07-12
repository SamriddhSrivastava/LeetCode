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



 /*
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
      ArrayList<List<Integer>> list=new ArrayList<>();
      if(root==null)
        return list;
      Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);
      int k=0;
      while(!q.isEmpty())
      {
        int size=q.size();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode node=q.poll();
            if(node.left!=null)
            q.offer(node.left);
            if(node.right!=null)
            q.offer(node.right);
            l.add(node.val);
        }
        if(k==0)
        {
            list.add(l);
            k=1;
        }
        else
        {
            Collections.reverse(l);
            list.add(l);
            k=0;
        }
      }  
      return list;
    }
}
*/


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
      ArrayList<List<Integer>> list=new ArrayList<>();
      if(root==null)
        return list;
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      int k=0;
      while(!q.isEmpty())
      {
        int size=q.size();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode node=q.poll();
            if(node.left!=null)
            q.add(node.left);
            if(node.right!=null)
            q.add(node.right);
            l.add(node.val);
        }
        if(k==0)
        {
            list.add(l);
            k=1;
        }
        else
        {
            Collections.reverse(l);
            list.add(l);
            k=0;
        }
      }  
      return list;
    }
}