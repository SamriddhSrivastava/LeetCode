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
    TreeNode subt=null;
    TreeNode par=null;
    public TreeNode deleteNode(TreeNode root, int key) 
    {
        if(root==null)
        return null;

        if(root.val==key)
        {
    
          if(root.left==null && root.right==null)
           return null;
          if(root.right==null)
            return root.left;
          if(root.left==null)
            return root.right;

          TreeNode temp=root.left;
          TreeNode cur=temp;

          while(cur.right != null)
             cur = cur.right;
          cur.right = root.right;
          return temp;
         }
         
        subtree(root,key);
        if(subt==null)
        return root;

       if(subt.left==null && subt.right==null)
       {
         if(par.left==subt)
          par.left=null;
        else
          par.right=null;
       }

       else if(subt.left!=null && subt.right==null)
       {
         if(par.left==subt)
           par.left=subt.left;
         else
           par.right=subt.left;
       }

       else if(subt.left==null && subt.right!=null)
       {
            if(par.left==subt)
             par.left=subt.right;
            else
             par.right=subt.right;
       }

        else
        {
            TreeNode temp=subt.left;
            TreeNode cur=temp;
            while(cur.right!=null)
              cur=cur.right;

            cur.right=subt.right;
            if(par.left==subt)
              par.left=temp;
            else
              par.right=temp;
        }
        return root;
    }
    void subtree(TreeNode root,int key)
    {
        if(root==null)
        return ;
        else if(root.val>key)
        {
            if(root.left!=null && root.left.val==key)
            {
                par=root;
                subt=root.left;
            }
            else
            subtree(root.left,key);
        }
        else
        {
            if(root.right!=null && root.right.val==key)
            {
                par=root;
                subt=root.right;
            }
            else
            subtree(root.right,key);
        }
        return ;
    }
}