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
class qs83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        ListNode control = head;

        while(temp != null){
            while(temp != null && temp.val == control.val){
                temp = temp.next;
            }
            control.next = temp;
            if (temp != null) {
                control = temp;
            }
        }


        return head;

    }
}