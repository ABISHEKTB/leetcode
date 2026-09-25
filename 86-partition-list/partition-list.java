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
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(0), b = new ListNode(0);
        ListNode p = a, q = b;
        while (head != null) {
            if (head.val < x) p = p.next = head;
            else q = q.next = head;
            head = head.next;
        }
        q.next = null;
        p.next = b.next;
        return a.next;
    }
}