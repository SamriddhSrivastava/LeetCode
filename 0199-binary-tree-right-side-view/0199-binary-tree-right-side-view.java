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
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) 
    {
        func(root,0);
        return list;
    }
    public void func(TreeNode node,int level)
    {
        if(node==null)
        return ;

        if(level==list.size())
        list.add(node.val);

        func(node.right,level+1);
        func(node.left,level+1);
    }
}