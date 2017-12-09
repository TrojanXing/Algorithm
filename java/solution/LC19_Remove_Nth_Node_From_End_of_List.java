class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode fast = h;
        ListNode slow = h;
        int count = 0;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return h.next;
    }
}