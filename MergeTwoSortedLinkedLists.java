/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode L;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val) {
            L = new ListNode(l1.val);
            l1 = l1.next;
        }
        else {
            L = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode cur = L;
        while(l1 != null && l2 != null) {
            //System.out.println(l1.val + " | " + l2.val);
            if(l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
                continue;
            }
            else if(l1.val == l2.val) {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;
                continue;
            }
            else {
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;
                continue;
            }
        }
        while(l1 != null) {
            cur.next = new ListNode(l1.val);
            cur = cur.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            cur.next = new ListNode(l2.val);
            cur = cur.next;
            l2 = l2.next;
        }
        return L;
    }
}
