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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
            return;

        ListNode secondHead = findMid(head);
        secondHead = reverse(secondHead);

        ListNode ptr = head;
        while(secondHead != null && ptr != null) {
            ListNode nextNode = secondHead.next;
            secondHead.next = ptr.next;
            ptr.next = secondHead;
            ptr = ptr.next.next;
            secondHead = nextNode;
        }
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        slow.next = null;

        return temp;
    }

    private ListNode reverse(ListNode head) {
        ListNode left = head;
        ListNode curr = head.next;
        left.next = null;

        while(curr != null) {
            ListNode right = curr.next;
            curr.next = left;
            left = curr;
            curr = right;
        }

        return left;
    }
}
