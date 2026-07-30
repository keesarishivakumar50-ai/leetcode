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
       ListNode first = head.next;
       ListNode second = first;

       while(second != null){
        int sum = 0;
        while(second.val != 0){
            sum += second.val;
            second = second.next;
        }
        first.val = sum;
        second = second.next;
        first.next = second;
        first = first.next;
       }
       return head.next;
    }
}