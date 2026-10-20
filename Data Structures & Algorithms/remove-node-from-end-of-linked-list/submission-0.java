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
        ListNode ptr = head;
        ListNode temp = head;

        for(int i=0; i<n; i++) {
            if(ptr == null) break;

            ptr = ptr.next;
        }

        if(ptr == null) return head.next;
        
        while(ptr.next != null) {
            ptr = ptr.next;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}
