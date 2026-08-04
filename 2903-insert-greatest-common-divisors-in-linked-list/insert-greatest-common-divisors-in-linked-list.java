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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            int x = gcd(cur.val , cur.next.val);
            ListNode newNode = new ListNode(x , cur.next);
            cur.next = newNode;
            cur = newNode.next;
        }
        return head;
    }
    private int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}