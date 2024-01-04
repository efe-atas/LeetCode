/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap< ListNode, Integer > intersect = new HashMap<ListNode, Integer>();
        int intersectVal = 0;

        ListNode temp = headA;

        while(temp != null){
            intersect.put(temp,temp.val);
            temp = temp.next;
        }

        temp = headB;

        while(temp != null){
            if(intersect.containsKey(temp)){
                intersectVal = temp.val;
                return temp;

            }
            temp = temp.next;
        }

        return null;

    }
}

