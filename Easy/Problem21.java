//Speed: 0ms (faster than 100% of all solutions)
//Memory: 38.5mb (less than 10.80% of all solutions)

//Merge Two Lists (logic self-explanatory):
class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        // System.out.println(l1.val);
        // System.out.println(l2.val);
        if (l1.val<l2.val) {
            return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        }
        else {
            return new ListNode(l2.val, mergeTwoLists(l1, l2.next));
        }
    }
}
