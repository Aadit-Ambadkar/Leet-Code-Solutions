//Speed: 2ms (faster than 78.68% of all solutions)
//Memory: 39.1mb (less than 74.87% of all solutions)

//Add Two Numbers:

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
class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, false);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean inc) {
        if (l1==null && l2==null) {
            if (inc) {
                return new ListNode(1);
            }
            return null;
        }
        if (l1==null) {
            int val = l2.val;
            if (inc) val++;
            if (val%10!=val) {
                inc=true;
                val%=10;
            }else {
                inc=false;
            }
            if (!inc) {
                l2.val=val;
                return l2;
            }
            return new ListNode(val, addTwoNumbers(l1, l2.next, inc));
        }
        if (l2==null) {
            int val = l1.val;
            if (inc) val++;
            if (val%10!=val) {
                inc=true;
                val%=10;
            }else {
                inc=false;
            }
            if (!inc) {
                l1.val=val;
                return l1;
            }
            return new ListNode(val, addTwoNumbers(l1.next, l2, inc));
        }
        int val = l1.val+l2.val;
        if (inc) val++;
        if (val%10!=val) {
            inc=true;
            val%=10;
        }else {
            inc=false;
        }
        return new ListNode(val, addTwoNumbers(l1.next, l2.next, inc));
    }
}
