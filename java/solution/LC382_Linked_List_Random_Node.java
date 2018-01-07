/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode head;
    Random random;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        random = new Random();
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int res = head.val;
        ListNode cur = head.next;
        int bound = 2;
        while(cur != null) {
            if(random.nextInt(bound++) == 0) {
                res = cur.val;
            }
            cur = cur.next;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */