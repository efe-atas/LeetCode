public class qs206 {
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

        public ListNode reverseList(ListNode head) {


            Stack<Integer> stack = new Stack<Integer>();
            ListNode temp = head;


            while(temp != null){
                stack.push(temp.val);
                temp = temp.next;
            }

            ListNode temp2 = head;
            while(!stack.empty()){
                temp2.val = stack.pop();
                temp2 = temp2.next;

            }

            return head;

        }
    
}
