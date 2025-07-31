// Last updated: 31/07/2025, 21:09:02
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
    public ListNode mergeNodes(ListNode head) {
         ListNode temp = head.next;
        ListNode temp1 = head;
        int res = 0;
        while(temp != null){
            if(temp.val == 0){
                temp1.next = new ListNode(res);
                temp1 = temp1.next;
                res = 0;
            }
            else{
                res += temp.val;
            }
            temp = temp.next;
        }
        return head.next;
    }
}