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
        ListNode newlist = head.next;
        ListNode nxt = newlist;

        while (nxt != null) {
            int sum = 0;
            while (nxt.val != 0) {
                sum += nxt.val;
                nxt = nxt.next;
            }
            newlist.val = sum;
            nxt = nxt.next;
            newlist.next = nxt;
            newlist = newlist.next;
        }
        return head.next;
    }
}