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
    public ListNode removeElements(ListNode head, int val) {
         ListNode head1 = new ListNode(0);
         head1.next = head;

         ListNode temp=head1;
         while(temp.next!=null){
            if(temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
         }
         return head1.next;
    }
}