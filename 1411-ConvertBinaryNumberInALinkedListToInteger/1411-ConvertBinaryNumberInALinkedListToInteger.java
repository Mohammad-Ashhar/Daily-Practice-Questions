// Last updated: 31/07/2025, 21:13:04
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
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode current=head;
        while(current!=null)
        {
            res=res*2+current.val;
            current=current.next;
        }
        return res;
        
    }
}