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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode front=dummy.next;
        ListNode fast=dummy.next;
        ListNode slow=dummy.next;
        for(int i=0;i<k-1;i++){
            front = front.next;
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp = front.val;
        front.val = slow.val;
        slow.val = temp;

        return dummy.next;
    }
}