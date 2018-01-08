/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        PriorityQueue<ListNode> pq = new PriorityQueue(new Comparator<ListNode>() {
            public int compare(ListNode n1, ListNode n2) {
                return n1.val - n2.val;
            }
        });
        for(ListNode node: lists) {
            if(node != null) {
                pq.offer(node);
            }
        }
        while(!pq.isEmpty()) {
            cur.next = pq.poll();
            if(cur.next.next != null) {
                pq.offer(cur.next.next);
            }
            cur = cur.next;
        }
        return head.next;
    }
}