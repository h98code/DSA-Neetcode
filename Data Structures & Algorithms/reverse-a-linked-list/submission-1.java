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

    private ListNode gh = null;

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        reverseHelper(head);

        return gh;
    }

    private void reverseHelper(ListNode head){

        if(head.next == null){
            gh = head;
            return;
        }

        reverseHelper(head.next);

        head.next.next = head;
        head.next = null;
    }
}
