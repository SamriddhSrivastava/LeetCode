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
    public int countNodes(TreeNode root) 
    {
     int c=0;
     if(root==null)
     return c;
     Queue<TreeNode> q=new LinkedList<>();
     q.offer(root);
     while(!q.isEmpty())
     {   c++;
        int n=q.size();
        TreeNode p=q.poll();
        if(p.left!=null)
        q.offer(p.left);
        if(p.right!=null)
        q.offer(p.right);
     }   
     return c;
    }
}