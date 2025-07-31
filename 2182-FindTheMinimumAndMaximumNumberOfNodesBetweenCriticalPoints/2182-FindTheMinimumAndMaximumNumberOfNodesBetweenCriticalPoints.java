// Last updated: 31/07/2025, 21:09:39
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode point = head.next;
        ListNode back=head;
        int i=1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(point.next!=null){
            int curr= point.val;
            int prevVal = back.val;
            int nextVal = point.next.val;

            if(curr > prevVal && curr> nextVal)ans.add(i);
            else if(curr < prevVal && curr < nextVal)ans.add(i);
            back= point;
            point= point.next;
            i++;
        }
        int mini=Integer.MAX_VALUE;
        int[] res= new int[2];
        res[0]=-1;
        res[1]=-1;
        if(ans.size()<=1)return res;
        for(i=1; i<ans.size(); i++){
            mini=Math.min(ans.get(i)-ans.get(i-1), mini);
        }
        int maxi= ans.get(ans.size()-1)- ans.get(0);
        res[0]=mini;
        res[1]=maxi;
        return res;
    }
}