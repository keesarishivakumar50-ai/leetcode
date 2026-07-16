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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevLeft = dummy;
        for(int i = 1 ; i < left ; i++){
            prevLeft = prevLeft.next;
        }
        ListNode leftNode = prevLeft.next;
        ListNode rightNode = leftNode;
        for(int i = 0 ; i < right - left ; i++){
            rightNode = rightNode.next;
        }
        ListNode rightNext = rightNode.next;
        
        ListNode prev = rightNext;
        ListNode cur = leftNode;

        while(cur != rightNext){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        prevLeft.next = prev;
        return dummy.next;
    }
}