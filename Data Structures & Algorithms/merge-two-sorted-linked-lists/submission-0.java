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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode fh = new ListNode(-1), ft = fh;

        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    ft.next = list1;
                    ft = ft.next;
                    list1 = list1.next;
                }else{
                    ft.next = list2;
                    ft = ft.next;
                    list2 = list2.next;
                }
            }else if(list1 != null){
                ft.next = list1;
                break;
            }else{
                ft.next = list2;
                break;
            }
        }

        return fh.next;
    }
}