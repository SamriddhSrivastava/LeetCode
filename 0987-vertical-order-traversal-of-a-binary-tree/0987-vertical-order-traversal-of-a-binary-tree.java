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
    class Pair
    {
    TreeNode node;
    int v;
    int l;
     Pair(TreeNode n,int v,int l)
     {
        node=n;
        this.v=v;
        this.l=l;
     }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
     TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> nodes=new TreeMap<>();
     Queue<Pair> q=new LinkedList<>();
     q.offer(new Pair(root,0,0));
     while(!q.isEmpty())
     {
        Pair p=q.poll();
        TreeNode temp=p.node;
        int x=p.v;
        int y=p.l;

        nodes.putIfAbsent(x,new TreeMap<>());
        nodes.get(x).putIfAbsent(y,new PriorityQueue<>());
        nodes.get(x).get(y).offer(temp.val);

        if(temp.left!=null)
        q.offer(new Pair(temp.left,x-1,y+1));
        if(temp.right!=null)
        q.offer(new Pair(temp.right,x+1,y+1));
     }
     List<List<Integer>> res=new ArrayList<>();
     for(TreeMap<Integer,PriorityQueue<Integer>> ts:nodes.values())
     {
        List<Integer> col=new ArrayList<>();
        for(PriorityQueue<Integer> p : ts.values())
        {
            while(!p.isEmpty())
                col.add(p.poll());
        }
        res.add(col);
     }
     return res;
    }    
}
