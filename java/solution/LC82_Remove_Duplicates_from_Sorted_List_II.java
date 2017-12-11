class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(0);
        ListNode slow = newHead;
        ListNode fast = head;
        newHead.next = head;
        while(fast!= null && fast.next != null) {
            if(fast.next.val == fast.val) {
                int val = fast.val;
                while(fast != null && fast.val == val) {
                    fast = fast.next;
                }
            } else {
                slow.next.val = fast.val;
                slow = slow.next;
                fast = fast.next;
            }
        }
        if(fast != null) {
            slow.next.val = fast.val;
            slow = slow.next;
        }
        slow.next = null;
        return newHead.next;
    }
}