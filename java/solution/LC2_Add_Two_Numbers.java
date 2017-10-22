package java.solution;
import java.dataStructure.*;

public class LC2_Add_Two_Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int sum = 0;
        int carry = 0;
        while(l1 != null || l2 != null | carry != 0){
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return head.next;
    }
}
