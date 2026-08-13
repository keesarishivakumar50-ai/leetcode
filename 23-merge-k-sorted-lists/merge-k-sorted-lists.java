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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        for(ListNode temp : lists){
            if(temp != null) queue.add(temp);
        }
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