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
    public int pairSum(ListNode head) {
        ListNode first = head , second = head , prev = null;
        while(first != null && first.next != null){
            first = first.next.next;
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        int max = 0;
        ListNode left = prev , right = second;

        while(left != null){
            max = Math.max(max , left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return max;
    }
}