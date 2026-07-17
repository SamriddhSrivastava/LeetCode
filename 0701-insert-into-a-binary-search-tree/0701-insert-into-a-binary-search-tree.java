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
    TreeNode node=new TreeNode();
    public TreeNode insertIntoBST(TreeNode root, int val) 
    {
        if(root==null)
        {
        node.val=val;
        return node;
        }

        findparent(root,val);
        return root;
    }
    void findparent(TreeNode root,int val)
    {
        if(root==null)
        return ;
        else if(root.val>val)
        {
            if(root.left==null)
            {
               root.left=node;
               node.val=val;
            }  
            else
            findparent(root.left,val);
        }
        else
        {
           if(root.right==null)
           {
              root.right=node;
              node.val=val;
           }
           else
           findparent(root.right,val);
        }
        return ;
    }
}