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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        return Insert(head);
    }
    private ListNode Insert(ListNode head)
    {
        ListNode curr=head;
        while(curr!=null && curr.next!=null)
        {
            int gcd=GCD(curr.val,curr.next.val);
            ListNode node=new ListNode(gcd);
            node.next=curr.next;
            curr.next=node;
            curr=node.next;
        }
        return head;
    }
    private int GCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}