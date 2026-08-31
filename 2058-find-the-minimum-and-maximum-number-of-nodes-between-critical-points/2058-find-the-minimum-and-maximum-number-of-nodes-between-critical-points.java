/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        if(head==null || head.next==null || head.next.next==null)
        return new int[]{-1,-1};
     int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,k=1,l=0,f=0;
     ListNode prev=head;
     ListNode temp=prev.next;
     ListNode front=temp.next;
     while(front!=null)
     {
       if((prev.val<temp.val && front.val<temp.val) || (prev.val>temp.val && temp.val<front.val))
       {
          if(f==0)
          {
           f=k;
           l=k;
          }
          else
          {
          max=Math.max(max,k-f);
          min=Math.min(min,k-l);
          l=k;
          }
       }
       k++;
       prev=temp;
       temp=front;
       front=front.next;
      
     }
      if(max==Integer.MIN_VALUE)
       return new int[]{-1,-1};
     return new int[]{min,max};
    }
}