package java.solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LC148_Sort_List {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;

        head = sortList(head);
        fast = sortList(fast);

        return merge(head, fast);
    }

    private ListNode merge(ListNode fir, ListNode sec) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(fir != null && sec != null){
            if(fir.val < sec.val){
                cur.next = fir;
                fir = fir.next;
            } else {
                cur.next = sec;
                sec = sec.next;
            }
            cur = cur.next;
        }
        cur.next = fir == null ? sec : fir;
        return head.next;
    }
}