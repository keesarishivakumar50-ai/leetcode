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
       ListNode sum = first;

       while(sum != null){
        int s = 0;
        while(sum.val != 0){
            s += sum.val;
            sum = sum.next;
        }
        first.val = s;
        sum = sum.next;
        first.next = sum;
        first = first.next;
       }
       return head.next;
    }
}