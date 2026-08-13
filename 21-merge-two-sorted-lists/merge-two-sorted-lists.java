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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        queue.add(list1);
        queue.add(list2);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            cur.next = node;
            cur = cur.next;

            if(node.next != null){
                queue.add(node.next);
            }
        }
        return dummy.next;
    }
}