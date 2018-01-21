/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        int count = 1;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count ++;
        }
        if(fast != null) {
            slow = slow.next;
        }
        ListNode rev = reverse(null, slow);
        ListNode cur = head;
        for(int i = 0; i < count; i++) {
            if(rev.val != cur.val) return false;
            cur = cur.next;
            rev = rev.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode next, ListNode curHead) {
        ListNode temp = curHead.next;
        curHead.next = next;
        if(temp == null) return curHead;
        else return reverse(curHead, temp);
    }
}