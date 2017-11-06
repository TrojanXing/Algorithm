package java.solution;

import java.dataStructure.ListNode;

public class LC203_Remove_Linked_List_Elements {
	// Solution 1 iterative
	public ListNode removeElements1(ListNode head, int val) {
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
	
	//Sollution 2 recursive
	public ListNode removeElements2(ListNode head, int val) {
		if(head == null) return null;
		head.next = removeElements2(head.next, val);
		return head.val == val ? head.next : head;
	}	
}
