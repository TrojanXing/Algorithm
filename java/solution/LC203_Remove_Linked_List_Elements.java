package java.solution;

import java.dataStructure.ListNode;

public class LC203_Remove_Linked_List_Elements {
	public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead;
        while(cur != null && cur.next != null) {
            while(cur.next != null && cur.next.val == val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}
