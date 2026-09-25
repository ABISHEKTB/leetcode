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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode a = d, b = d;
        for (int i = 0; i < n; i++)
            b = b.next;
        while (b.next != null) {
            a = a.next;
            b = b.next;
        }
        a.next = a.next.next;
        return d.next;
    }
}